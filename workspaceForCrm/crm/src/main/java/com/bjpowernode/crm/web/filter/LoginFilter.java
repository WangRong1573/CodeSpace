package com.bjpowernode.crm.web.filter;

import com.bjpowernode.crm.settings.domain.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/20
 **/

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        //强转成HttPServletRequest
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String path = request.getServletPath();
        //不应该拦截的资源,放行
        if ("/login.jsp".equals(path) || "/setting/user/login.do".equals(path)) {
            chain.doFilter(req, res);
        } else {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (user != null) {
                //登陆成功
                chain.doFilter(req, res);
            } else {
                /*
                 * 关于转发和重定向的复习
                 *   1.重定向和转发路径问题
                 *       在实际开发中，对于路径的使用，不论是前端还是后端，应该一律使用绝对路径
                 *       关于路径的写法：
                 *           转发：使用一种特殊的绝对路径的使用方式，这种绝对路径前面不加 /项目名 ，成为内部路径
                 *                /login.jsp
                 *           重定向：前面必须以 /项目名开头
                 *               /crm/login.jsp
                 *   2.为什么使用重定向？
                 *       转发之后，路径会停留在老路径上，而不是跳转之后最新的资源路径
                 *       应该在用户跳转到登录页的同时，浏览器地址栏应该自动设置为当前登录页的路径
                 *
                 * */
                //登录失败，重定向到登录页

                //获取项目名 request.getContextPath();
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
        }
    }
}
