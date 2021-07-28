package com.example.ems.controller;

import com.example.ems.entity.User;
import com.example.ems.service.UserService;
import com.example.ems.utils.VerifyCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/7/27
 **/

@RestController
@CrossOrigin
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getImage")
    public String getImage(HttpServletRequest request) throws IOException {
        //1.使用工具类生成验证码
        String code = VerifyCodeUtils.generateVerifyCode(4);
        //2.将验证码放入ServletContext作用域
        request.getServletContext().setAttribute("code",code);
        //3.将图片转为base64
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        VerifyCodeUtils.outputVerifyImage(120, 30, byteArrayOutputStream, 4);
        //添加前面字符串是为了前端好处理
        return "data:image/png;base64," + Base64Utils.encodeToString(byteArrayOutputStream.toByteArray());
    }

    @PostMapping(value = "/register")
    public Map<String,Object> register(@RequestBody User user,String code,HttpServletRequest request){
        log.info("用户信息：[{}]",user.toString());
        log.info("用户输入的验证码信息：[{}]",code);
        HashMap<String, Object> map = new HashMap<>();
        try {
            //获取验证码
            String key = (String) request.getServletContext().getAttribute("code");
            //与用户输入验证码比对
            if (key.equalsIgnoreCase(code)){
                userService.add(user);
                map.put("state",true);
                map.put("respMsg","注册成功");
            }else {
                throw new RuntimeException("验证码错误");
            }
        }catch (Exception e){
            e.printStackTrace();
            map.put("state",false);
            map.put("respMsg",e.getMessage());
        }
        return map;
    }
}
