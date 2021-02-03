package com.bj.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/2/3
 **/

public class TwoServlet extends HttpServlet {
    /**
     * post请求处理参数是将参数放在请求体中，是由request对象负责解码，需要使用utf-8字符集进行解码
     * 手动设置 字符集为utf-8 可以避免参数乱码问题
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        System.out.println("post 方式参数值为："+username);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("get方式参数值为："+username);
    }
}
