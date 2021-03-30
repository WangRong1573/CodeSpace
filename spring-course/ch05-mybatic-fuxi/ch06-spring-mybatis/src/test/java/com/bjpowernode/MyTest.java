package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/30
 **/

public class MyTest {
    @Test
    public void test01(){
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student(null, "apple", 19);
        service.add(student);
    }
}
