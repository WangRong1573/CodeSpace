package com.bjpoernode.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration  //开启dubbo配置
public class Ch14DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch14DubboConsumerApplication.class, args);
    }

}
