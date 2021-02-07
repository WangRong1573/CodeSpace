package com.bj.controller;

import com.bj.dao.UsersDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");

        UsersDao dao = new UsersDao();

        int result = dao.delete(userId);

        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        if (result == 1){
            out.print("<p style='color:red;font-size:30px'>删除成功</p>");
        }else {
            out.print("<p style='color:red;font-size:30px'>删除失败</p>");
        }
    }
}
