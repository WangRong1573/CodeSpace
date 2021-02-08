package com.bj.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建Cookie对象保存共享数据
        Cookie cookie1 = new Cookie("key1", "value1");
        Cookie cookie2 = new Cookie("key2", "value2");

        /*
        Cookie相当于一个map
        一个cookie中只能存放一个键值对
        这个键值对的key和value只能是String
        键值对中的key不能是中文
         */

        //将cookie写入到响应头，交给浏览器
        response.addCookie(cookie1);
        response.addCookie(cookie2);


    }
}
