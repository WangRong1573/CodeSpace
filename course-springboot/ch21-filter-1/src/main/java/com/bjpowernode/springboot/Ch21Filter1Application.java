package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Ch21Filter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch21Filter1Application.class, args);
    }

}
