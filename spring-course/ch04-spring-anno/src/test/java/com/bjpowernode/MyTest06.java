package com.bjpowernode;

import com.bjpowernode.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/25
 **/

public class MyTest06 {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ba06/ApplicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
