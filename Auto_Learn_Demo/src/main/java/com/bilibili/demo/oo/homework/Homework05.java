package com.bilibili.demo.oo.homework;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:学生类学习面向对象
 * @Author rong.wang
 * @Date 2020/6/9
 **/

public class Homework05 {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setAddress("上海市浦东新区");
        student.setZipCode("100120");
        student.setMobile("18272698888");
        System.out.println(student.getName()+","+student.getPostAddress());
    }
}

class Student{

    private String name;

    private int age;

    //地址
    private String address;

    //邮编
    private String zipCode;

    //电话
    private String mobile;

    //返回学生地址和邮编
    public String getPostAddress(){
        return "地址："+this.getAddress()+"，邮编："+this.getZipCode();
    }

    public Student() {
    }

    public Student(String name, int age, String address, String zipCode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
