package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/24
 **/

@Controller
public class TestRedisController {

    @Autowired
    private TestRedisService testRedisService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String key, String value){
        testRedisService.put(key,value);
        return "已成功存入：值-"+key+",value"+value;
    }
}
