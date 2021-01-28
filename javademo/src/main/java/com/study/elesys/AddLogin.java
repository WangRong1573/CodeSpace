package com.study.elesys;

import java.sql.*;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:增加登录验证操作
 * @Author rong.wang
 * @Date 2021/1/27
 **/

public class AddLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rsInt = 0;
        String deptNo;
        String dName;
        String loc;
        String username;
        String pwd;

        String sql_1 = "insert into dept values(?,?,?)";
        String sql_2 = "delete from dept where deptno=?";
        String sql_3 = "update dept set dname=? , loc=? where deptno=?";
        String sql_4 = "select * from dept";
        String sql_5 = "select count(*) from emp where ename=? and empno=?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "localhost");

            System.out.println("请输入用户名：");
            username = scanner.next();
            System.out.println("请输入密码：");
            pwd = scanner.next();
            //添加登录信息，以员工姓名和员遍作为用户名密码
            PreparedStatement ps = conn.prepareStatement(sql_5);
            ps.setString(1,username);
            ps.setString(2,pwd);

            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                rsInt = rs.getInt("count(*)");
            }
            if (rs != null){
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rsInt != 1){
                System.out.println("用户名密码错误");
                return;
            }

            while (true){
                System.out.println("欢迎使用员工管理系统");
                System.out.println("1.添加员工信息");
                System.out.println("2.删除员工信息");
                System.out.println("3.修改员工信息");
                System.out.println("4.查询员工信息");
                System.out.println("请选择：");
                int i = scanner.nextInt();
                if (i == 1){
                    System.out.println("请输入部门编号：");
                    deptNo = scanner.next();
                    System.out.println("请输入部门姓名：");
                    dName = scanner.next();
                    System.out.println("请输入部门地址：");
                    loc = scanner.next();

                    ps = conn.prepareStatement(sql_1);
                    ps.setInt(1, Integer.parseInt(deptNo));
                    ps.setString(2,dName);
                    ps.setString(3,loc);

                    int result = ps.executeUpdate();
                    System.out.println(result == 1 ?"添加成功":"添加失败");

                    if (ps != null) {
                        ps.close();
                    }
                }else if (i == 2){
                    System.out.println("请输入部门编号：");
                    deptNo = scanner.next();

                    ps = conn.prepareStatement(sql_2);
                    ps.setInt(1, Integer.parseInt(deptNo));

                    int delCount = ps.executeUpdate();
                    System.out.println(delCount == 1?"删除成功":"删除失败");

                    if (ps != null) {
                        ps.close();
                    }
                }else if (i == 3){
                    System.out.println("请输入部门编号：");
                    deptNo = scanner.next();
                    System.out.println("请输入部门姓名：");
                    dName = scanner.next();
                    System.out.println("请输入部门地址：");
                    loc = scanner.next();

                    ps = conn.prepareStatement(sql_3);
                    ps.setString(1,dName);
                    ps.setString(2,loc);
                    ps.setInt(3, Integer.parseInt(deptNo));

                    int updateCount = ps.executeUpdate();
                    System.out.println(updateCount == 1 ?"更新成功":"更新失败");

                    if (ps != null) {
                        ps.close();
                    }
                }else if (i == 4){
                    ps = conn.prepareStatement(sql_4);
                    rs = ps.executeQuery();
                    while (rs.next()){
                        int deptno = rs.getInt("deptno");
                        String dname = rs.getString("dname");
                        String loc1 = rs.getString("loc");

                        System.out.println("deptno\t"+deptno+"dname\t"+dname+"loc\t"+loc1);
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
                System.out.println("退出请按0，按任意键返回上级菜单");
                rsInt = scanner.nextInt();
                if (rsInt == 0){
                    System.out.println("系统正在关闭中");
                    if (conn != null) {
                        conn.close();
                    }
                    System.out.println("感谢您的使用");
                    break;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
