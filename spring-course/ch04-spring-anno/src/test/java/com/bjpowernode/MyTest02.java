package com.bjpowernode;

import com.bjpowernode.ba02.Student;
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

public class MyTest02 {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ba02/ApplicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
        //Student{id=1002, name='张三'}
    }
}
