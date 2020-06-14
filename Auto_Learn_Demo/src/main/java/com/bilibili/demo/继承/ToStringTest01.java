package com.bilibili.demo.继承;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:从object类中继承toString()方法，并进行重写
 * @Author rong.wang
 * @Date 2020/6/14
 **/

public class ToStringTest01 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
    }
}

class MyDate{

    private int year;

    private int month;

    private int day;

    public MyDate() {
        this(1970,1,1);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //重写toString方法

    @Override
    public String toString() {
        return
                "year=" + year +
                ", month=" + month +
                ", day=" + day ;
    }
}
