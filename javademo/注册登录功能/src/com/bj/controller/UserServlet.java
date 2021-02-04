package com.bj.controller;

import com.bj.dao.UsersDao;
import com.bj.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName,password,sex,email;
        UsersDao dao = new UsersDao();

        userName = request.getParameter("userName");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");

        Users user = new Users(null, userName, password, sex, email);
        int i = dao.add(user);

        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        if (i == 1){
            writer.print("<font style='color:red;font-size=40px'>注册成功</font>");
        }else {
            writer.print("<font style='color:red;font-size=40px'>注册失败</font>");
        }
    }
}
