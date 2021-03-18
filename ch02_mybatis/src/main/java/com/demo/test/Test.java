package com.demo.test;

import com.demo.domain.Student;
import com.demo.service.StudentService;
import com.demo.service.impl.StudentServiceImpl;
import com.demo.util.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public class Test {
    public static void main(String[] args) {
        //此时应使用代理类
        //StudentServiceImpl service = new StudentServiceImpl();
        StudentService service = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        Student student = new Student(null, "mike", 22);
        service.save(student);
    }

}
