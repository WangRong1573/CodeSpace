package com.bj.util;

import java.sql.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/2/4
 **/

public class JDBCUtil {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection creatConn(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","localhost");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public PreparedStatement creatPre(String sql){
        try {
            ps = creatConn().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
