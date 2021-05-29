package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public String test(){
        return "跳转到这个路径";
    }

    @RequestMapping(value = "/jump")
    public String jump(Model model){
        model.addAttribute("id",1001);
        model.addAttribute("name","zs");
        model.addAttribute("age",28);
        return "index";
    }


    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1(String id,String name){
        return "跳转到这个路径,参数是："+id+"name="+name;
    }

    @RequestMapping(value = "/test2")
    @ResponseBody
    public String jump2(Integer id,String name,Integer age){
        return "请求路径是/test2,参数是：id="+id+",name="+name+",age="+age;
    }
}
