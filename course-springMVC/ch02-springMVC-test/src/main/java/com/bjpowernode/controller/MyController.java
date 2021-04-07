package com.bjpowernode.controller;

import demo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/7
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","测试springMVC处理请求，得到响应，显示在结果页面");
        mv.setViewName("result");
        return mv;
    }

    /**
     *
     * @param name 处理器方法的形参名需要与请求中的参数名保持一致，同名的请求参数赋值给同名的形参
     * @param age
     * @return
     */
    @RequestMapping(value = "/reg.do")
    public ModelAndView doReg(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("reg");
        return mv;
    }

    /**
     * @RequestParam 逐个接收请求参数中，解决请求中参数名和形参名不一致问题
     *      属性：value 请求中的形参名称
     *              required，布尔值，默认是true，表示请求中必须包含此参数
     *
     *      位置：在处理器方法形参定义的前面
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/receiveParam.do")
    public ModelAndView receiveParam(@RequestParam(value = "pname",required = false) String name,
                                     @RequestParam(value = "page",required = false) Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("reg");
        return mv;
    }

    @RequestMapping(value = "/receiveObject.do")
    public ModelAndView receiveObject(Student student){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());
        mv.addObject("student",student);
        mv.setViewName("obj");
        return mv;
    }
}
