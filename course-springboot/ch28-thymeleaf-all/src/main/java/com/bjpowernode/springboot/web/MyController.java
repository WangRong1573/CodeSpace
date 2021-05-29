package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Map<Integer,List<User>>> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            HashMap<Integer, List<User>> map = new HashMap<>();
            for (int j = 0; j < 2; j++) {
                ArrayList<User> users = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setName("zs"+k);
                    user.setAge(10+k);
                    users.add(user);
                }
                map.put(j,users);
            }
            list.add(map);
        }
        model.addAttribute("list",list);
        return "all";
    }
}
