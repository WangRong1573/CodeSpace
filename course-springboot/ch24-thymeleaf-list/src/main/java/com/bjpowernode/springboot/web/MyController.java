package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/29
 **/

@Controller
public class MyController {

    @RequestMapping(value = "/user/list")
    public String userList(Model model){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(1001+i);
            user.setName("zs"+i);
            user.setAge(23+i);
            users.add(user);
        }
        model.addAttribute("userList",users);
        return "userList";
    }
}
