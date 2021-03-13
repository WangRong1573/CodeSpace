package com.demo.controller;

import com.demo.dao.ProvinceDao;
import com.demo.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pid = request.getParameter("pid");
        Province p = null;

        if (pid != null  && !"".equals(pid)){
            ProvinceDao dao = new ProvinceDao();
            p = dao.getProvinceById(Integer.valueOf(pid));
        }

        ObjectMapper om = new ObjectMapper();
        String jsonStr = om.writeValueAsString(p);

        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(jsonStr);
    }
}
