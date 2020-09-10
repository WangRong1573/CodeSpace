package com.jdbc;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 通过配置文件方式读取
 * @Author rong.wang
 * @Date 2020/9/10
 **/

public class JDBCTest03 {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String claPath = bundle.getString("claPath");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        String sql = bundle.getString("sql");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName(claPath);

            //获取连接
            conn = DriverManager.getConnection(url, user, password);

            //获取数据库操作对象
            stmt =conn.createStatement();

            //执行sql
            rs = stmt.executeQuery(sql);

            //遍历结果集
            while (rs.next()){
                int sno = rs.getInt("sno");
                String sname = rs.getString("sname");
                int classno = rs.getInt("classno");
                System.out.println(sno+"\t"+sname+"\t"+classno);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭连接，遵循从小到大关闭
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
