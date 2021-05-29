package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

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
        HashMap<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("zs"+i);
            user.setAge(10+i);
            map.put(i,user);
        }
        model.addAttribute("map",map);
        return "map";
    }
}
