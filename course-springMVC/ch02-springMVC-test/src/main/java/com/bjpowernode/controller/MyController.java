package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/7
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","测试springMVC处理请求，得到响应，显示在结果页面");
        mv.setViewName("result");
        return mv;
    }

    /**
     *
     * @param name 处理器方法的形参名需要与请求中的参数名保持一致，同名的请求参数赋值给同名的形参
     * @param age
     * @return
     */
    @RequestMapping(value = "/reg.do")
    public ModelAndView doReg(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("reg");
        return mv;
    }
}
