package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/10
 **/

public class MyInterceptor implements HandlerInterceptor {
    /**
     * preHandle预处理方法
     * 是项目的入口，当返回true，请求可以被处理；返回false，请求到此方法就截止
     * 可以看作是多个controller公用的功能，集中到拦截器统一处理，使用的是aop思想
     *
     * @param request
     * @param response
     * @param handler  被拦截的控制器对象
     * @return boolean
     * true：表示通过了拦截器的验证，可以执行处理器中的方法
     * false：表示请求没有通过拦截器的验证，请求到达拦截器就被截止了
     * 特点：
     * 1.在控制器方法（MyController的doSome）执行之前执行
     * 2.在这个方法中获取请求信息，验证请求是否符合要求
     * 失败，截断请求
     * 成功，放行，到控制器方法
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        Object attr = request.getSession().getAttribute("name");
        String name = "";
        if (attr != null){
            name = (String) attr;
        }

        if (!"zs".equals(name)){
            request.getRequestDispatcher("tips.jsp").forward(request,response);
            return false;
        }
        return true;
    }

    /**
     * 后处理方法
     * 处理器方法执行之后执行
     * 可以获取处理器方法处理后得到的返回值ModeAndView，可以修改ModeAndView中的数据和视图，影响最后的处理结果
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    /**
     * 在请求处理完成后执行的，框架中规定视图处理完成后，对视图执行了forward，认为请求处理完成
     * 一般做资源回收工作，程序请求过程中创建的对象在这里删除，回收占用的内存
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
