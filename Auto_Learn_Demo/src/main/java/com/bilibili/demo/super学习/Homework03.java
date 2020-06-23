package com.bilibili.demo.super学习;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:显示人的姓名和年龄的小练习
 * @Author rong.wang
 * @Date 2020/6/23
 **/

public class Homework03 {
    public static void main(String[] args) {

        Person p = new Person("Jack", 18);
        System.out.println(p.toString());
    }
}

class Person{

    private String name;

    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age;
    }
}
