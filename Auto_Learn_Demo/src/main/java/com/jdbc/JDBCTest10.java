package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: preparedStatement完成增删改
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class JDBCTest10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
            String user = "root";
            String pwd = "localhost";
            conn = DriverManager.getConnection(url,user,pwd);

            //3.获取数据库预编译对象
            String sql = "insert into t_user(loginName,loginPwd,realName) values (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"max");
            ps.setString(2,"admin");
            ps.setString(3,"汉字");

            //4.执行sql
            ps.executeUpdate();

            //5.处理结果集
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.释放连接
            if (ps != null){
                try {
                    ps.close();
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
