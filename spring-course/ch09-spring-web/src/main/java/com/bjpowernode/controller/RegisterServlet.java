package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        /*//创建spring容器对象
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        System.out.println("容器中对象的信息："+ac);*/

        WebApplicationContext ctx = null;
        //获取ServletContext中的容器对象
        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        Object attribute = getServletContext().getAttribute(key);
        if (attribute != null){
            ctx =(WebApplicationContext)attribute;
        }
        System.out.println("容器中对象的信息："+ctx);

        StudentService service = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setName(name);
        student.setAge(Integer.valueOf(age));
        service.add(student);

        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

}
