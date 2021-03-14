package com.demo.controller;

import com.demo.dao.ProvinceDao;
import com.demo.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ProvinceLoadServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String jsonStr = "{}";
        ProvinceDao dao = new ProvinceDao();
        ArrayList<Province> province = dao.getProvince();

        ObjectMapper om = new ObjectMapper();
        jsonStr = om.writeValueAsString(province);

        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(jsonStr);
    }
}
