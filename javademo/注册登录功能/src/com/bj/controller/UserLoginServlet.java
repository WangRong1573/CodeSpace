package com.bj.controller;

import com.bj.dao.UsersDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result = 0;
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        UsersDao dao = new UsersDao();

        result = dao.login(userName,password);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        if (result == 1){
            response.sendRedirect("/App/index.html");
        }else {
            response.sendRedirect("/App/loginError.html");
        }
    }
}
