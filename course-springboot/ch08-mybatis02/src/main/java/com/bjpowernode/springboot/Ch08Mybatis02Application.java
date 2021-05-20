package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")
public class Ch08Mybatis02Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch08Mybatis02Application.class, args);
    }

}
