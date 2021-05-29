package com.bjpowernode.springboot.web;


import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/29
 **/
@Controller
public class MyController {
    @RequestMapping(value = "/test")
    public String test(Model model){
        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            user.setId(i);
            user.setName("zs"+i);
            user.setAge(10+i);
            users[i]=user;
        }
        model.addAttribute("userArray",users);
        return "userArray";
    }
}
