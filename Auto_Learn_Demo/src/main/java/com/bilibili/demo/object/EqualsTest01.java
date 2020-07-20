package com.bilibili.demo.object;

import java.util.Objects;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:equals用于比较两个对象是否相等，字符串的比较也采用equals进行比较
 * 基本数据类型之间判断是否相等时比较两个变量的值是否相等，使用 “ == ”
 *
 * equals方法在使用时，需要对equals方法进行重写，因为底层是判断两个对象的地址是否相等
 *
 * @Author rong.wang
 * @Date 2020/7/20
 **/

public class EqualsTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("xiaoming", 1821);
        Student s2 = new Student("xiaoming", 1821);
        Student s3 = new Student("xiaofang", 2000);
        Student s4 = new Student("xiaoming", 2001);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

class Student{

    String name;

    int cardId;

    public Student() {
    }

    public Student(String name, int cardId) {
        this.name = name;
        this.cardId = cardId;
    }

    @Override
    public boolean equals(Object o) {
        //如果o和当前对象为同一对象时，返回true
        if (this == o){
            return true;
        }

        //当前对象为空或者不是Student的子类时
        if (o == null || !(o instanceof Student)){
            return false;
        }

        //程序运行到此说明是Student的子类,访问子类特有的属性需要使用向下转型
        Student obj = (Student) o;
        //当this对象的name和id均相等时，认为是同一个Student
        if (this.name.equals(obj.name) && this.cardId==obj.cardId){
            return true;
        }

        return false;
    }
}