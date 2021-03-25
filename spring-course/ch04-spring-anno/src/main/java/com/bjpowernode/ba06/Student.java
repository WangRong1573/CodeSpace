package com.bjpowernode.ba06;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/25
 **/

@Component("student")
public class Student {

    /**
     * @Resource 来自jdk中的注解，spring框架提供了对注解的支持，自动注入，支持byName，byType方式，默认是byName
     * 位置：1.在属性上 2.set方法上
     *
     * 默认是使用byName方式自动注入，失败了则使用byType方式
     */
    @Resource(name = "mySchool")
    @Qualifier("mySchool")
    private School school;

    @Value("1004")
    private Integer id;
    @Value("李四")
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
