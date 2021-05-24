package com.bjpoernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.service.TestService;
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
public class StudentController {
    //选择com.alibaba.dubbo.config.annotation.Reference
    @Reference(interfaceClass = TestService.class,version = "1.0.0",check = false)
    private TestService testService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public Integer test(){
        Integer count = testService.queryCount();
        return count;
    }
}
