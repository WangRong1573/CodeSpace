package com.bjpowernode;

import com.bjpowernode.service.DoSome;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/24
 **/

public class MyTest {
    @Test
    public void testSayHello(){
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        DoSome doSome = (DoSome) ac.getBean("some");
        doSome.sayHello();
    }
}
