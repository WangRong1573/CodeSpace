package com.bilibili.demo.reflect;

import com.google.gson.internal.bind.util.ISO8601Utils;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: Class.forName()方法会让类加载，类加载时执行静态代码块，静态代码块只执行一次
 *
 * 如果只希望一个类的静态代码块执行，其他一律不执行，可使用Class.forName("完整类名")来实现
 * @Author rong.wang
 * @Date 2020/8/12
 **/

public class ReflectTest04 {
    public static void main(String[] args) {

        try {
            Class.forName("com.bilibili.demo.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    static {
        System.out.println("MyClass 的静态代码块执行了");
    }

    public void test(){
        System.out.println("hello world");
    }
}
