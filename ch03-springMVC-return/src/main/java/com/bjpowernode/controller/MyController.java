package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


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
}
