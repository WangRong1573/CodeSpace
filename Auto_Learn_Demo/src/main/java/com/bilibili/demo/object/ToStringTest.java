package com.bilibili.demo.object;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:toString方法学习
 * @Author rong.wang
 * @Date 2020/7/20
 **/

public class ToStringTest {
    public static void main(String[] args) {
        MyTime time = new MyTime(2020, 10, 2);
        System.out.println(time);
    }
}

class MyTime{

    int year;

    int month;

    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "当前时间是："+year+"-"+month+"-"+day;
    }
}
