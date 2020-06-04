package com.bilibili.demo.oo.静态代码块;

import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:静态代码块学习
 * 特点：类加载时执行，并且只执行一次，执行在main方法执行之前,按照自上而下顺序执行；
 * 作用：记录类加载的时机
 * @Author rong.wang
 * @Date 2020/6/4
 **/

public class StaticTest01 {
    static {
        System.out.println(new Date(System.currentTimeMillis()));
    }

    static {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    static {
        System.out.println("C");
    }
}
