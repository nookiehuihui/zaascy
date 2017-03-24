import com.netcenter.zaascy.bean.User;
import com.netcenter.zaascy.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/24.
 */
public class TestPolling implements Runnable{
    public static void main(String[] args) {
        new TestPolling().run();

    }

    /**
     * 获取目标表最新的记录修改时间
     * @return
     */
    private static Date getLastedDate(String tableName){
        Long startTime = System.currentTimeMillis();
        Date date = null;
        Connection conn = DBUtil.getConnection();
        String sql = "select MAX(JILXGSJ) AS date from " + tableName;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                date = rs.getTimestamp("date");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("本次getLastedDate操作用时:"+(endTime-startTime));
        return date;
    }

    /**
     * 根据上次查询的最后操作时间查询新操作记录
     * @param lastDate
     * @return
     */
    private static List<Long> getModifyIdList(Date lastDate){
        Long startTime = System.currentTimeMillis();
        List<Long> list = new ArrayList<Long>();
        Date date = null;
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT YONGH_ID FROM XTYH WHERE JILXGSJ > ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setTimestamp(1,new Timestamp(lastDate.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("YONGH_ID");
                list.add(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("本次getModifyIdList操作用时:"+(endTime-startTime) + "  list长度" + list.size());
        return list;
    }

    /**
     * 根据取得的id列表新增数据入新表
     * @param ids
     * @return
     */
    private static void insertByIdList(List<Long> ids){
        Long startTime = System.currentTimeMillis();

        for(long id : ids){
            System.out.println("id 为"+id);
        }

        if(ids!=null){
            Connection conn = DBUtil.getConnection();
            String sql = "insert into XTYH_NEW select * from XTYH WHERE XTYH.YONGH_ID IN ( ?  ";
            for(int i=1;i<ids.size();i++){
                sql = sql + ",?";
            }
            sql = sql + ")";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                for(int i=0;i<ids.size();i++){
                    ps.setLong(i+1,ids.get(i));
                }
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBUtil.close(conn);
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("本次insertByIdList操作用时:"+(endTime-startTime));
    }

    /**
     * 删除已有记录
     * @param ids
     */
    private static void delByIdList(List<Long> ids){
        Long startTime = System.currentTimeMillis();

        if(ids!=null){
            Connection conn = DBUtil.getConnection();
            String sql = "DELETE FROM XTYH_NEW where YONGH_ID in ( ? ";
            for(int i=1;i<ids.size();i++){
                sql = sql + ",?";
            }
            sql = sql + ")";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                for(int i=0;i<ids.size();i++) ps.setLong(i + 1, ids.get(i));
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBUtil.close(conn);
            }
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("本次insertByIdList操作用时:"+(endTime-startTime));
    }

    public static List<Long> getDelIdList(){
        List<Long> list = new ArrayList<Long>();
        Connection conn = DBUtil.getConnection();
        String sql = "insert into XTYH_NEW_LOG VALUES (?,?,?,?)";

        return list;
    }

    /**
     * 新增查询记录
     * @param date
     */
    public static void insertLog(Date date,String remark, Integer count){
        Connection conn = DBUtil.getConnection();
        String sql = "insert into XTYH_NEW_LOG VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setTimestamp(1,new Timestamp(date.getTime()));
            ps.setTimestamp(2,new Timestamp((new Date()).getTime()));
            ps.setString(3," ");
            ps.setInt(4,count);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
    }

    public static void oneSearch(){
        Date date_log = getLastedDate("XTYH_NEW");
        Date date = getLastedDate("XTYH");
        if(date_log.compareTo(date)>=0){
            System.out.println("一次轮询成功,没有更新记录");
        }else{
            List<Long> ids = getModifyIdList(date_log);
            delByIdList(ids);
            insertByIdList(ids);
            insertLog(date,"",ids.size());
            System.out.println("一次轮询成功,记录条数:"+ids.size());
        }
        System.out.println("----------------------------------------");

    }

    public void run() {
        while(true){
            try {
                oneSearch();
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
