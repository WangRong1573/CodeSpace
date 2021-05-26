package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/26
 **/

@Controller
@RequestMapping(value = "/user")
public class MyController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        User user = new User();
        user.setId(10001);
        user.setName("zs");
        request.getSession().setAttribute("user",user);
        return "login success";
    }


    @RequestMapping(value = "/inner")
    @ResponseBody
    public String inner(){
        return "this page can see after login";
    }

    @RequestMapping(value = "/all")
    @ResponseBody
    public String all(){
        return "all can see this";
    }

    @RequestMapping(value = "/error")
    @ResponseBody
    public String error(){
        return "看到这了，说明你没登录就访问需要登录的页面了";
    }
}
