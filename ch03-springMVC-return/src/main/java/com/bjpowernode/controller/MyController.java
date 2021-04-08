package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/8
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/returnString.do",method = RequestMethod.POST)
    public String returnString(HttpServletRequest request, String name, Integer age){
        request.setAttribute("name",name);
        request.setAttribute("age",age);
        return "show";
    }

    @RequestMapping(value = "/returnVoid.do")
    public void returnString(HttpServletResponse response,String name, Integer age) throws IOException {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        String json = "{}";
        if (student != null){
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(json);
    }

    /**
     * 处理器方法返回一个Student，通过框架转为json，响应ajax请求
     * @ResponseBody作用：
     * 把处理器方法返回对象转为json后，通过HttpServletResponse输出给浏览器
     *
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "/returnStudentJsonObject.do")
    public Student returnStudentJsonObject() throws IOException {
        //模拟调用service，获取请求结果
        Student student = new Student();
        student.setName("张三同学");
        student.setAge(66);
        return student;
    }

    @ResponseBody
    @RequestMapping(value = "/returnStudentJsonObjectArray.do")
    public List<Student> returnStudentJsonObjectArray() throws IOException {
        List<Student> list = new ArrayList<>();
        //模拟调用service，获取请求结果
        Student student = new Student();
        student.setName("张三同学");
        student.setAge(66);
        list.add(student);
        student = new Student();
        student.setName("小二同学");
        student.setAge(18);
        list.add(student);
        return list;
    }
}
