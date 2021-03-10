package com.ajax.controller;

import com.ajax.dao.ProvinceDao;
import com.ajax.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/10
 **/

public class CitySearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Province province = null;
        String data = "{}";

        if (id != null && !"".equals(id)){
            ProvinceDao dao = new ProvinceDao();
            province = dao.getProvinceInfoById(Integer.valueOf(id));

            //使用jackson将对象转成json字符串
            ObjectMapper om = new ObjectMapper();
            data = om.writeValueAsString(province);
        }

        //将数据传给ajax异步对象

        //指定服务器端返回是json格式数据
        resp.setContentType("application/json;charset=utf8");
        PrintWriter out = resp.getWriter();
        out.print(data);
    }
}
