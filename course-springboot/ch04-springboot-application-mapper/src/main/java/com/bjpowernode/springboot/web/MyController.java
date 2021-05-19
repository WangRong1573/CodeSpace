package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.domain.School;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private School school;

    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        return school.getName()+"=="+school.getWebsit()+"=="+school.getAge();
    }
}
