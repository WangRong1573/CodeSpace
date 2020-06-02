package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:参数传递学习
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class TestChuanCan {
    public static void main(String[] args) {
        Person p = new Person();
        p.age=10;
        add(p);
        System.out.println("main--->"+p.age);
    }

    public static void add(Person p){
        p.age++;
        System.out.println("add---->"+p.age);
    }
}

class Person{
    int age;
}