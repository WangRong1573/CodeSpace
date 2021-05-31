package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/31
 **/

@Controller
public class UserController {

    @RequestMapping(value = "/function")
    public String function(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("data","springBootHelloWorld");
        return "function";
    }
}
