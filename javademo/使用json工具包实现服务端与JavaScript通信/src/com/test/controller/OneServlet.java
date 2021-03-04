package com.test.controller;

import com.alibaba.fastjson.JSONArray;
import com.test.entity.Dept;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dept dept = new Dept(20, "营销部", "河南省商丘市");
        Object json = JSONArray.toJSON(dept);
        request.setAttribute("key",json);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
