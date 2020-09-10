package com.jdbc;

import java.sql.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: JDBC练习
 * @Author rong.wang
 * @Date 2020/9/9
 **/

public class JDBCTest02 {
    public static void main(String[] args) {

        Connection conn = null;

        PreparedStatement ps = null;
        try {
            //注册驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //获取连接
            String url ="jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String pwd = "localhost";
            conn = DriverManager.getConnection(url, user, pwd);

            //获取操作数据库的预处理对象
            ps = conn.prepareStatement("select * from t_student");

            //执行sql，得到结果集
            ResultSet rs = ps.executeQuery();

            //5 遍历结果集
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " "+rs.getString(2) + " "+rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
