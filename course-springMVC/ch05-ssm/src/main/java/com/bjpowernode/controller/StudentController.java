package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/9
 **/

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/add.do")
    public ModelAndView add(Student student){
        ModelAndView mv = new ModelAndView();
        int nums = service.add(student);
        String tips = "注册失败";
        if (nums > 0){
            tips = "学生【"+student.getName()+"】注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    @ResponseBody
    @RequestMapping("/query.do")
    public List<Student> query(){
        List<Student> students = service.query();
        return students;
    }
}
