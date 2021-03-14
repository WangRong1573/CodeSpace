package com.demo.controller;

import com.demo.dao.CityDao;
import com.demo.entity.City;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class QueryCityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String json = "{}";
        String pid = request.getParameter("pid");

        if (pid != null && !"".equals(pid.trim())){
            CityDao dao = new CityDao();
            ArrayList<City> cities = dao.getCityById(Integer.valueOf(pid));
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(cities);
            response.setContentType("application/json;charset=utf8");
            PrintWriter out = response.getWriter();
            out.print(json);
        }

    }
}
