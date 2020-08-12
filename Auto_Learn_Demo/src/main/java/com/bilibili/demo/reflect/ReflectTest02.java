package com.bilibili.demo.reflect;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 通过反射实例化对象
 * @Author rong.wang
 * @Date 2020/8/12
 **/

public class ReflectTest02 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.bilibili.demo.reflect.bean.User");
            //newInstance()方法调用User类的无参构造方法，创建User对象
            //必须保证User类的无参构造方法是存在的，否则会报异常
            Object o = aClass.newInstance();
            System.out.println(o); //com.bilibili.demo.reflect.bean.User@1f32e575
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
