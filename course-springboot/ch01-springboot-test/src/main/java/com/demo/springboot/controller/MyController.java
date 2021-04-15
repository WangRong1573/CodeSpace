package com.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/15
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "hello springboot";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello springboot,这是jsp显示");
        mv.setViewName("test");
        return mv;
    }
}
