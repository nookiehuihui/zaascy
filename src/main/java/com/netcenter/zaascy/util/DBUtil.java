package com.netcenter.zaascy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/3/21.
 */
public class DBUtil {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://192.168.68.130:1433;DatabaseName=zaasmis","sa",".....");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(Connection conn){
        if(conn!=null){
            try{
                conn.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();
        if(conn!=null){
            System.out.println("连接成功");
        }
        DBUtil.close(conn);
    }
}
