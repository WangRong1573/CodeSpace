package com.bjpowernode.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/25
 **/

@Component("student")
public class Student {

    @Autowired
    private School school;

    @Value("1002")
    private Integer id;
    @Value("张三")
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school=" + school +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
