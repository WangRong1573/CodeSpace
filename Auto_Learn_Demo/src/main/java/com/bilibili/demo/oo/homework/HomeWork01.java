package com.bilibili.demo.oo.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:面向对象学习，学习使用内存图方式了解程序运行
 * @Author rong.wang
 * @Date 2020/6/8
 **/

public class HomeWork01 {
    public static void main(String[] args) {
        Husband husband = new Husband("张三", 20, null);
        Wife wife = new Wife("小芳", 18, null);

        //建立关联，结婚
        husband.w=wife;
        wife.h=husband;

        System.out.println(husband.name+"今年"+husband.age+"了,娶了一个"+husband.w.age+"岁，叫"+husband.w.name+"的女孩");
    }
}


class Husband{

    String name;

    int age;

    Wife w;

    public Husband(String name, int age, Wife w) {
        this.name = name;
        this.age = age;
        this.w = w;
    }
}

class Wife{

    String name;

    int age;

    Husband h;

    public Wife(String name, int age, Husband h) {
        this.name = name;
        this.age = age;
        this.h = h;
    }
}