package com.bjpowernode.ba02;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("doSome 方法执行");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("doOther 方法执行");
        return "abc";
    }
}
