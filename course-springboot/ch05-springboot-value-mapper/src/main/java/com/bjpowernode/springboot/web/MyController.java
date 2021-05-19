package com.bjpowernode.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/19
 **/

@Controller
public class MyController {

    @Value("${user.username}")
    private String name;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.addr}")
    private String addr;

    @RequestMapping(value = "/test")
    public @ResponseBody String test(){
        return name+"==="+age+"==="+addr;
    }
}
