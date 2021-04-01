package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/1
 **/

/**
 * @Controller 创建处理器对象，对象放在springMVC容器中
 */
@Controller
public class MyController {
    /**
     * 处理用户请求，springMVC使用方法来处理
     * 方法名自定义，可以多种返回值，多种参数
     *
     * 准备doSome方法处理some.do请求
     *
     * @RequestMapping 请求映射，作用是把一个方法和请求地址绑定
     * 一个请求指定一个方法处理
     *
     * 属性：
     * value，是一个string，表示请求的uri地址（some.do）,唯一的，不可重复，使用时推荐"/"开头
     *
     * 位置：
     * 1.在方法上（推荐）
     * 2.类上
     *
     * 说明：使用@RequestMapping修饰的方法叫做处理器方法或者控制器方法
     * 可以处理请求，类似于servlet中的doget和dopost
     *
     * 返回值：ModelAndView 本次请求的处理结果
     * model：数据，处理完成后，展示给用户的数据
     * view：试图，比如jsp
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("msg","第一个springMVC例子的内容");
        mv.addObject("fun","doSome方法执行了");

        //指定试图,试图的完成路径
        mv.setViewName("/show.jsp");

        return mv;
    }
}
