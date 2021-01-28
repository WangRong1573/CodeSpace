package com.study.elesys;

import com.study.elesys.dao.DeptDao;
import com.study.elesys.entity.Dept;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:使用工具类和Dao类实现部门管理系统
 * @Author rong.wang
 * @Date 2021/1/28
 **/

public class TestMain2 {
    public static void main(String[] args) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        String username, pwd,deptNo,dName,loc;
        JDBCUtil util = new JDBCUtil();
        DeptDao dao = new DeptDao();
        String sql = "select count(*) from emp where ename=? and empno=?";

        //登录验证模块
        System.out.println("请输入用户名：");
        username = sc.next();
        System.out.println("请输入密码：");
        pwd = sc.next();

        ps = util.creatPre(sql);
        ps.setString(1,username);
        ps.setInt(2, Integer.parseInt(pwd));

        rs = ps.executeQuery();

        while (rs.next()){
            flag = rs.getInt("count(*)");
        }

        util.close();

        if (flag != 1){
            System.out.println("用户名密码错误");
            return;
        }

        while (true){
            System.out.println("欢迎使用部门管理系统");
            System.out.println("1,添加员工信息");
            System.out.println("2.删除员工信息");
            System.out.println("3.修改员工信息");
            System.out.println("4.查询员工信息");
            System.out.println("请选择：");
            flag = sc.nextInt();

            if (flag == 1){
                System.out.println("请输入部门编号：");
                deptNo = sc.next();
                System.out.println("请输入部门名称：");
                dName = sc.next();
                System.out.println("请输入部门地址：");
                loc = sc.next();

                flag = dao.add(deptNo,dName,loc);
                System.out.println(flag == 1?"添加成功":"添加失败");
            }else if (flag == 2){
                System.out.println("请输入要删除的部门编号：");
                deptNo = sc.next();

                flag = dao.delete(deptNo);
                System.out.println(flag == 1?"删除成功":"删除失败");
            }else if (flag == 3){
                System.out.println("请输入要修改的部门编号：");
                deptNo = sc.next();
                System.out.println("请输入新部门名称：");
                dName = sc.next();
                System.out.println("请输入新部门地址：");
                loc = sc.next();

                flag = dao.update(deptNo,dName,loc);
                System.out.println(flag == 1?"更新成功":"更新失败");
            }else if (flag == 4){
                List<Dept> deptList = dao.findAll();
                for (Dept dept:deptList){
                    System.out.println(dept.getDeptNo()+"\t"+dept.getdName()+"\t"+dept.getLoc());
                }
            }else {
                System.out.println("输入有误");
                return;
            }
            System.out.println("按0退出系统，任意键返回上一级菜单");
            flag = sc.nextInt();
            if (flag == 0){
                System.out.println("谢谢使用");
                break;
            }
        }
    }
}
