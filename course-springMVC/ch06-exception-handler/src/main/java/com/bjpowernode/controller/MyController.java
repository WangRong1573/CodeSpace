package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.MyException;
import com.bjpowernode.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public ModelAndView doSome(String name, Integer age) throws MyException {
        ModelAndView mv = new ModelAndView();
        if (!"zs".equals(name)) {
            throw new NameException("名称不正确");
        }
        if (age == null || age > 80) {
            throw new AgeException("年龄不合法");
        }
        mv.addObject("msg", "测试springMVC处理请求，得到响应，显示在结果页面");
        mv.setViewName("result");
        return mv;
    }

}
