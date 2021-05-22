package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/5/22
 **/

@RestController  //等同于类上加注解@Controller + 方法上加@ResponseBody
public class StudentController {

    //访问路径： http://localhost:8080/detail?id=1001&age=1423
    @RequestMapping(value = "/detail")
    public Object test(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //使用RESTful风格路径  http://localhost:8080/detail/111/222
    @RequestMapping(value = "detail/{id}/{age}")
    public Object test2(@PathVariable("id") Integer id,
                        @PathVariable("age") Integer age){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("age",age);
        return map;
    }


}
