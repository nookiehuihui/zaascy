package com.netcenter.zaascy.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/3/21.
 */
public class LoginUtil {
    //定义有效的时间间隔
    private final static Long VALID_INTERVALS = new Long(10000);

    public String login(String token){
        System.out.println(token);
        //接收到客户端的token,判断token是否为空
        if(token==null||token.equals("")){
            return "null token";
        }
        try {
            //解码token
            String token_de = SecurityUtil.decryptMessage(token);
            //分割出token中的用户名和令牌
            String[] token_arr = token_de.split("&");
            if(token_arr.length!=2){
                return "illegal token";
            }
            String username = token_arr[0];
            String passId = token_arr[1];
            //验证用户名是否存在
            if(!verifyUsername(username)){
                return "username non-existent";
            }
            String token_word = SecurityUtil.decryptMessage(passId);
            //验证passId是否通过
            if(!verifyTokenWord(username,token_word)){
                return "error token";
            }
            //验证是否超时

            if(!verifyTime(token_word)){
                return "overtime";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    /**
     * 验证username是否存在
     * @param username
     * @return
     */
    private static boolean verifyUsername(String username){
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT user_id FROM A_LOGIN_REQ WHERE username = '" + username +"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        return false;
    }

    /**
     * 验证token是否正确
     * @param username
     * @param tokenWord
     * @return
     */
    private static boolean verifyTokenWord(String username, String tokenWord){
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT username FROM A_LOGIN_REQ WHERE token_word = '" + tokenWord +"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String username_sql = rs.getString("username");
                if (username_sql!=null||username_sql.equals(username)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        return false;
    }

    /**
     * 验证token是否失效
     * @param tokenWord
     * @return
     */
    private static boolean verifyTime(String tokenWord){
        Connection conn = DBUtil.getConnection();
        Long time = System.currentTimeMillis() - VALID_INTERVALS;
        System.out.println("当前毫秒数:"+time);
        String sql = "SELECT time FROM A_LOGIN_REQ WHERE token_word = '" + tokenWord +"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Long time_sql = rs.getLong("time");
                System.out.println("数据库毫秒数:"+time_sql);
                if (time_sql!=null&&time_sql.compareTo(time)>=0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
        return false;
    }

    public static void main(String[] args) {
//        String tokenWord = "12668Erf";
//        updateTime(tokenWord);
//        System.out.println("验证用户名是否存在:"+verifyUsername("pengyh"));
//        System.out.println("验证token是否正确:"+verifyTokenWord("pengyh",tokenWord));
//        System.out.println("验证token是否过期:"+verifyTime(tokenWord));
        LoginUtil lu = new LoginUtil();
        String token = "tMqwR1mR4doflVSmpc9g+ZmNYZfdy7/kTQH3QLbajtA=";
        System.out.println(lu.login(token));
    }

    private static void updateTime(String tokenWord){
        Connection conn = DBUtil.getConnection();
        Long time = System.currentTimeMillis();
        System.out.println("初始毫秒数:"+time);
        String sql = "UPDATE A_LOGIN_REQ  SET time = ? WHERE token_word = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1,time);
            ps.setString(2,tokenWord);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn);
        }
    }
}
