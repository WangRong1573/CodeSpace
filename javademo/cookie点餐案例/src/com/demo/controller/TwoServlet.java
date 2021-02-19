package com.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = null;
        int money = 0;
        int jiaozi_money = 30;
        int miantiao_money = 20;
        int gaifan_money = 15;
        response.setContentType("text/html;charset=utf8");
        PrintWriter out = response.getWriter();
        Cookie newMoney = null;
        //消费
        int consume = 0;
        //余额
        int balance = 0;

        //1.从请求头中读取参数信息
        String food = request.getParameter("food");

        //2.读取cookie信息
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie:cookies){
            //一个cookie对象只能存放一个键值对
            String name = cookie.getName();
            String value = cookie.getValue();

            if ("userName".equals(name)){
                //用户名信息
                userName = value;
            }else if ("money".equals(name)){
                //金额信息
                money = Integer.parseInt(value);
                if ("jiaozi".equals(food)){
                    //如果账户金额 < 点餐金额 提示用户余额不足，请充值
                    if (jiaozi_money > money){
                        out.print("用户："+userName+"余额不足，请充值");
                    }else {
                        //如果账户金额 > 点餐所需金额，则使用消费后金额覆盖原金额(添加空字符串是因为cookie数据类型只能是字符串)
                        newMoney = new Cookie("money",(money - jiaozi_money)+"");
                        consume = jiaozi_money;
                        balance = money - jiaozi_money;
                    }
                }else if ("miantiao".equals(food)){
                    //如果账户金额 < 点餐金额 提示用户余额不足，请充值
                    if (miantiao_money > money){
                        out.print("用户："+userName+"余额不足，请充值");
                    }else {
                        //如果账户金额 > 点餐所需金额，则使用消费后金额覆盖原金额(添加空字符串是因为cookie数据类型只能是字符串)
                        newMoney = new Cookie("money",(money - miantiao_money)+"");
                        consume = miantiao_money;
                        balance = money - miantiao_money;
                    }
                }else if ("gaifan".equals(food)){
                    //如果账户金额 < 点餐金额 提示用户余额不足，请充值
                    if (gaifan_money > money){
                        out.print("用户："+userName+"余额不足，请充值");
                    }else {
                        //如果账户金额 > 点餐所需金额，则使用消费后金额覆盖原金额(添加空字符串是因为cookie数据类型只能是字符串)
                        newMoney = new Cookie("money",(money - gaifan_money)+"");
                        consume = gaifan_money;
                        balance = money - gaifan_money;
                    }
                }
            }
        }
        //将新cookie写入到响应头中
        response.addCookie(newMoney);
        out.print("用户："+userName+"\t本次消费："+consume+"\t余额为："+balance);
    }
}
