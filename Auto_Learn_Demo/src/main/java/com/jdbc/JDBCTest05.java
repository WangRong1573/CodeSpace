package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: JDBC删除和更新
 * @Author rong.wang
 * @Date 2020/9/10
 **/

public class JDBCTest05 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            //1.注册驱动，利用类加载机制
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String password = "localhost";
            conn = DriverManager.getConnection(url, user, password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行sql
            String sql = "delete from t_student where sno=22";
            //返回影响数据库的条数
            int i = stmt.executeUpdate(sql);
            System.out.println(i==1 ? "删除成功" : "删除失败");

            //遍历数据结果集

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
