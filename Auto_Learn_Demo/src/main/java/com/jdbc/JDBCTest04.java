package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: JDBC操作过程练习
 * @Author rong.wang
 * @Date 2020/9/10
 **/

public class JDBCTest04 {
    public static void main(String[] args) {

        Connection conn =null;
        Statement stmt =null;
        try {
            //1.注册驱动(利用类加载机制，因为这个类中有一个静态代码块会在类加载时执行，完成驱动注册)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接
            String url ="jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String password = "localhost";
            conn = DriverManager.getConnection(url, user, password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行sql
            String sql ="insert into t_student(sno,sname,classno) values(22,'lilei',101)";
            int i = stmt.executeUpdate(sql);
            //5.遍历查询结果集
            //insert，update，delete不需要遍历结果集

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.释放资源
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
