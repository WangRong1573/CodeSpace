package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 账户转账演示事务机制
 * 在JDBC中事务是默认自动提交的，即每执行一条DML语句就会自动提交事务
 *
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class JDBCTest11 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
            String user = "root";
            String pwd = "localhost";
            conn = DriverManager.getConnection(url,user,pwd);

            //将自动提交修改为手动提交事务
            conn.setAutoCommit(false);

            //获取数据库预编译对象
            String sql = "update t_act set balance = ? where actNo = ?";
            ps = conn.prepareStatement(sql);

            //给?传值
            ps.setDouble(1,10000);
            ps.setInt(2,111);
            int i = ps.executeUpdate();

////            演示当未添加手动提交事务代码时，数据不正确问题
//            String s = null;
//            s.toString();

            ps.setDouble(1,10000);
            ps.setInt(2,222);
            i +=ps.executeUpdate();

            System.out.println(i==2 ? "转账成功":"转账失败");

            //程序执行到此，说明以上程序没有异常，事务结束，手动提交事务
            conn.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            //为了保证数据的安全性，遇到异常不修改数据，回滚
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
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
