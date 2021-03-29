package com.bjpowernode;

import com.bjpowernode.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

public class Test03 {

    @Test
    public void test(){
        String config = "ba03/ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("service");
        //之所以能改变结果，原理简单理解为：String s = service.myAround("mike", 25);
        String s = service.doFirst("mike", 25);
        System.out.println(s);
    }
}
