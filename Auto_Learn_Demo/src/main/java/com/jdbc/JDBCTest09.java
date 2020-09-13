package com.jdbc;

import java.sql.*;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 当业务场景需要使用sql拼接时候需要使用 Statement 来完成
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class JDBCTest09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你希望的排列方式：");
        System.out.println("asc 表示升序 \t desc 表示降序");
        System.out.println("请输入：");
        String keywords = scanner.nextLine();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //注册驱动

            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String pwd = "localhost";
            conn = DriverManager.getConnection(url,user,pwd);

            //获取数据库操作对象
            stmt = conn.createStatement();

            //执行sql
            String sql = "select loginName from t_user order by loginName "+keywords;
            rs = stmt.executeQuery(sql);

            //遍历结果集
            while (rs.next()){
                System.out.println(rs.getString("loginName"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
