package com.jdbc.utils;

import java.sql.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: JDBC工具类的封装
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class DBUtil {

    /**
     * 工具类构造方法私有化，使用类名. 方式调用
     */
    private DBUtil() {
    }

    /**
     * 静态代码块会在类加载时执行，并且只执行一次
     * 防止有多个语句多次调用工具类时，多次调用获取驱动现象
     */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return 连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8", "root", "localhost");
    }

    /**
     * 释放连接
     * @param conn 数据库连接对象
     * @param ps    数据库操作对象
     * @param rs    处理结果集
     */
    public static void close(Connection conn, Statement ps, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
