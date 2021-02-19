package com.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象获取请求头中的参数
        String userName = request.getParameter("userName");
        String money = request.getParameter("money");

        //2.创建cookie对象
        Cookie uName = new Cookie("userName", userName);
        Cookie uMoney = new Cookie("money", money);

        //3.将cookie写入到响应头中
        response.addCookie(uName);
        response.addCookie(uMoney);

        //4.请求转发，将点餐页面写入到响应体中
        response.sendRedirect("/App/index_2.html");
    }
}
