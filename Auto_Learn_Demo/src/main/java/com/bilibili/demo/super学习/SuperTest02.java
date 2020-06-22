package com.bilibili.demo.super学习;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:super的理解
 * @Author rong.wang
 * @Date 2020/6/22
 **/

public class SuperTest02 {
    public static void main(String[] args) {
        Vip vip = new Vip("张三");
        vip.shopping();
    }
}

class Customer{

    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
}

class Vip extends Customer{

    public Vip() {
    }

    public Vip(String name) {
        super(name);
    }

    public void shopping(){
        //通过内存图比较三者之间是否存在区别，真正理解super含义
        System.out.println(this.name+"正在购物");
        System.out.println(super.name+"正在购物");
        System.out.println(name+"正在购物");
    }
}