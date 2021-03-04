package com.demo.controller;

import com.demo.entity.Student;
import com.demo.util.ReflectUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student(10, "mike");
        StringBuilder jsonObject = ReflectUtil.jsonObject(student);
        request.setAttribute("key",jsonObject);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
