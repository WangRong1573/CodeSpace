package com.bjpowernode.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    /**
     * 使用@Autowired 的byName方式实现自动注入
     *  1.在属性上使用@Autowired
     *  2.在属性上使用@Qualifier(value= "bean的id")
     */
    @Autowired
    @Qualifier("mySchool")
    private School school;

    @Value("1003")
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
