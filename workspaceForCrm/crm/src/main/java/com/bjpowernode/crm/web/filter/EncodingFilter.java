package com.bjpowernode.crm.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/20
 **/

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        //过滤post请求中文参数乱码
        req.setCharacterEncoding("utf-8");

        //过滤响应流响应中文乱码
        res.setContentType("text/html;charset=utf-8");

        //将请求放行
        chain.doFilter(req,res);
    }
}
