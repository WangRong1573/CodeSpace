package com.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 用户登录业务
 * 1.模拟用户登录功能
 * 描述：程序运行时提供入口，可以让用户输入用户名和密码，提交信息，java收集用户信息
 * java程序连接数据库，校验用户名和密码是否在数据库内
 * 合法：登录成功
 * 不合法：登录失败
 * 2.数据的准备：
 * 在实际开发中，表的设计会使用专业的建模工具，例如powerDesigner,使用数据库t_user表
 * @Author rong.wang
 * @Date 2020/9/10
 **/

public class JDBCTest06 {
    public static void main(String[] args) {
        //初始化页面
        Map<String, String> userLoginInfo = initUI();
        //验证用户名密码
        boolean loginResult = login(userLoginInfo);
        //最后输出登录结果
        System.out.println(loginResult ? "登录成功" : "登陆失败");

    }

    /**
     * 用户登录
     *
     * @param userLoginInfo 用户登录信息
     * @return false表示登录失败，true表示登录成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {

        //设置标记
        boolean loginResult = false;

        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");

        //JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            String url = "jdbc:mysql://localhost:3306/student_info?serverTimezone=GMT%2B8";
            String user = "root";
            String password = "localhost";
            conn = DriverManager.getConnection(url, user, password);

            //获取数据库操作对象
            stmt = conn.createStatement();

            //执行sql
            String sql = "select * from t_user where loginName='" + loginName + "' and loginPwd='" + loginPwd + "'";
            rs = stmt.executeQuery(sql);

            //处理结果集
            if (rs.next()) {
                loginResult = true;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
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
        return loginResult;
    }

    /**
     * 初始化用户页面，返回用户登录的信息
     *
     * @return
     */
    private static Map<String, String> initUI() {

        Scanner scn = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String loginName = scn.nextLine();

        System.out.println("请输入密码：");
        String loginPwd = scn.nextLine();

        HashMap<String, String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName", loginName);
        userLoginInfo.put("loginPwd", loginPwd);

        return userLoginInfo;
    }
}
