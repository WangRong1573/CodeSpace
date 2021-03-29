package com.bjpowernode.ba03;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

public class SomeServiceImpl implements SomeService {

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("业务方法执行成功");
        return "abc";
    }
}
