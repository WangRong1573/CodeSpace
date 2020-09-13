package com.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 *      1.测试工具类是否正确
 *      2.实现模糊查询
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class JDBCTest12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection();

            String sql = "select ename from emp where ename like ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,"_A%");

            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }
}
