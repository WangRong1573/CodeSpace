package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        //创建spring容器对象
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        System.out.println("容器中对象的信息："+ac);

        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setName(name);
        student.setAge(Integer.valueOf(age));
        service.add(student);

        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

}
