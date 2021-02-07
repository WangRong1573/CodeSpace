package com.bj.controller;

import com.bj.dao.UsersDao;
import com.bj.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/2/4
 **/

public class ShowUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersDao dao = new UsersDao();
        ArrayList<Users> users = dao.showUsers();
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>用户编号：</td>");
        out.print("<td>用户姓名：</td>");
        out.print("<td>用户密码：</td>");
        out.print("<td>用户性别：</td>");
        out.print("<td>用户邮箱：</td>");
        out.print("<td>操作</td>");
        out.print("</tr>");
        for (Users u:users){
            out.print("<tr>");
            out.print("<td>"+u.getUserId()+"</td>");
            out.print("<td>"+u.getUserName()+"</td>");
            out.print("<td>"+u.getPassword()+"</td>");
            out.print("<td>"+u.getSex()+"</td>");
            out.print("<td>"+u.getEmail()+"</td>");
            out.print("<td><a href='/App/user/delete?userId="+u.getUserId()+"'>删除</a></td>");
            out.print("</tr>");
        }

        out.print("</table>");
        for (Users u:users) {

        }
    }
}
