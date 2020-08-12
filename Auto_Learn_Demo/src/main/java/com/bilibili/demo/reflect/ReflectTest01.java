package com.bilibili.demo.reflect;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 反射学习：
 * 获取Class实例的三种方式
 *  1.Class.forName() 静态方法，参数是字符串，完整包名：java.lang.String
 *  2.Object类中的getClass()方法，任何一个对象都可以调用
 *  3.
 * @Author rong.wang
 * @Date 2020/8/12
 **/

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //有异常，看源码 ClassNotFoundException
        Class<?> c1 = Class.forName("java.lang.String");
        Class<?> c2 = Class.forName("java.util.Date");

        //第二种
        String s = "abc";
        Class<? extends String> c3 = s.getClass();
        System.out.println(c3 == c1);//true,双等号比较内存地址

        //第三种方式
        //java中任何一种类型，包括基本数据类型都有.class属性
        Class s2 = String.class;
    }
}
