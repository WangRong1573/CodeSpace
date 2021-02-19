package com.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用请求对象，向Tomcat 索要session
        HttpSession session = request.getSession();

        //根据业务需要，本次取商品名称，就是session对象中的key，因为本身是map
        Enumeration<String> goodsNames = session.getAttributeNames();

        while (goodsNames.hasMoreElements()){
            //取出来的每个元素就是商品名称
            String goodsName = goodsNames.nextElement();

            //商品个数
            int goodsNum = (int) session.getAttribute(goodsName);

            System.out.println("商品名称："+goodsName+"\t商品数量："+goodsNum);
        }
    }
}
