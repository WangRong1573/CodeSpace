package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.service.TestService;
import org.springframework.stereotype.Component;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/24
 **/
@Component
@Service(interfaceClass = TestService.class,version = "1.0.0",timeout = 15000)
//选择dubbo的service，相当于：dubbo:service interface="",version="",timeout=""
public class TestServiceImpl implements TestService {
    @Override
    public Integer queryCount() {
        return 250;
    }
}
