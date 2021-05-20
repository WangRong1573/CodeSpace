package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/20
 **/

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/test")
    public @ResponseBody
    Student test(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }
}
