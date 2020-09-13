package com.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 模拟用户登录，复习JDBC写法
 * @Author rong.wang
 * @Date 2020/9/13
 **/

public class JDBCTest08 {
    public static void main(String[] args) {
         Map<String,String> userInfo = init();

        boolean loginResult = login(userInfo);

        System.out.println(loginResult ? "登录成功" : "用户名密码不正确");

    }

    private static boolean login(Map<String, String> userInfo) {

        //标记登录状态为false
        boolean loginResult = false;

        String username = userInfo.get("username");
        String password = userInfo.get("password");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String pwd = "localhost";
            conn = DriverManager.getConnection(url,user,pwd);

            //获取数据库预编译对象
            //sql语句的框架，“ ？”代表占位符，占位符不能使用反引号括起来
            String sql = "select loginName,loginPwd from t_user where loginName= ? and loginPwd= ? ";
            ps = conn.prepareStatement(sql);

            //给占位符传值，（第一个?下标为1，第二个下标为2.。JDBC中所有下标从1开始）
            ps.setString(1,username);
            ps.setString(2,password);

            //执行sql
            rs = ps.executeQuery();

            //处理结果集
            //如果正确则数据库内有且仅有一条数据与之对应
            if (rs.next()){
                loginResult = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭连接
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
        return loginResult;
    }

    /**
     * 模拟用户操作界面，接收用户名密码
     * @return
     */
    private static Map<String, String> init() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        HashMap<String, String> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);

        return map;
    }
}
