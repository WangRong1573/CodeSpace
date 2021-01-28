package com.study.elesys;

import java.sql.*;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:员工管理系统，通过输入实现增删改查
 * @Author rong.wang
 * @Date 2021/1/26
 **/

public class TestMain {
    public static void main(String[] args) {
        //标记用户输入数值
        int flag = 0;
        int deptNo;
        String dname;
        String loc;
        String sql_1 = "insert into dept values(?,?,?)";
        String sql_2 = "delete from dept where deptno=?";
        String sql_3 = "update dept set dname=?,loc=? where deptno=?";
        String sql_4 = "select * from dept where deptno=?";

        Scanner request = new Scanner(System.in);
        System.out.println("*******欢迎使用员工管理系统******");
        System.out.println("******1.添加员工信息******");
        System.out.println("******2.删除员工信息******");
        System.out.println("******3.修改员工信息******");
        System.out.println("******4.查询员工信息******");
        System.out.println("请选择：");
        flag = request.nextInt();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "localhost");

            if (flag == 1){
                System.out.println("请输入部门编号：");
                deptNo = request.nextInt();
                System.out.println("请输入部门名称：");
                dname = request.next();
                System.out.println("请输入部门位置：");
                loc = request.next();

                PreparedStatement ps = conn.prepareStatement(sql_1);
                ps.setInt(1,deptNo);
                ps.setString(2,dname);
                ps.setString(3,loc);

                int i = ps.executeUpdate();
                System.out.println(i == 1?"插入数据成功":"插入数据失败");

                if (ps != null) {
                    ps.close();
                }

            }else if (flag == 2){
                System.out.println("请输入要删除的部门编号：");
                deptNo = request.nextInt();

                PreparedStatement ps = conn.prepareStatement(sql_2);
                ps.setInt(1,deptNo);

                int i = ps.executeUpdate();
                System.out.println(i == 1?"删除数据成功":"删除数据失败");

                if (ps != null) {
                    ps.close();
                }
            }else if (flag == 3){
                System.out.println("请输入部门编号：");
                deptNo = request.nextInt();
                System.out.println("请输入部门名称：");
                dname = request.next();
                System.out.println("请输入部门位置：");
                loc = request.next();

                PreparedStatement ps = conn.prepareStatement(sql_3);
                ps.setString(1,dname);
                ps.setString(2,loc);
                ps.setInt(3,deptNo);

                int i = ps.executeUpdate();
                System.out.println(i == 1?"更新数据成功":"更新数据失败");

                if (ps != null) {
                    ps.close();
                }
            }else if (flag == 4){
                System.out.println("请输入部门编号：");
                deptNo = request.nextInt();

                PreparedStatement ps = conn.prepareStatement(sql_4);
                ps.setInt(1,deptNo);

                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                    int deptno = rs.getInt("deptno");
                    String name = rs.getString("dname");
                    String loc1 = rs.getString("loc");
                    System.out.println("deptno:"+deptno+"dname:"+name+"loc"+loc1);
                }

                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            }else {
                System.out.println("输入有误");
                return;
            }

            if (conn != null) {
                conn.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
