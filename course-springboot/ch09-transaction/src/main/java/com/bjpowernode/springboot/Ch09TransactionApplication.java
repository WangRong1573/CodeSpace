package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")
public class Ch09TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch09TransactionApplication.class, args);
    }

}
