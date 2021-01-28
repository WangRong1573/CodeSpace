package com.study.elesys;

import java.sql.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:JDBC工具类封装
 * @Author rong.wang
 * @Date 2021/1/28
 **/

public class JDBCUtil {

    private Connection conn = null;
    private PreparedStatement ps = null;

    /**
     * 利用静态代码块会在类加载时执行且只执行一次的特性
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connection 对象封装
     * @return
     * @throws SQLException
     */
    public Connection creatConn() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "localhost");
        return conn;
    }

    /**
     * 封装PreparedStatement
     * @param sql
     * @return
     * @throws SQLException
     */
    public PreparedStatement creatPre(String sql) throws SQLException {
        ps = creatConn().prepareStatement(sql);
        return ps;
    }

    public void close(){
        if (ps != null) {
            try {
                ps.close();
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

    /**
     * 使用重载机制
     */
    public void close(ResultSet rs){
        close();
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
