package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.bjpowernode.springboot.servlet")
public class Ch19Servlet1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch19Servlet1Application.class, args);
    }

}
