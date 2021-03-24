package org.example;

import org.example.domain.User;
import org.example.service.UserService;
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

public class TestHomework {
    @Test
    public void testHomework(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) ac.getBean("service");
        User user = new User("mike", 1001);
        userService.addUser(user);
    }
}
