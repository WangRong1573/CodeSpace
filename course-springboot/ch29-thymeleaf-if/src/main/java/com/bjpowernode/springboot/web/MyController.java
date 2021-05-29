package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/29
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/test")
    public String test(Model model){
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "test";
    }
}
