package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/8
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/returnString.do",method = RequestMethod.POST)
    public String returnString(HttpServletRequest request, String name, Integer age){
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        return "show";
    }
}
