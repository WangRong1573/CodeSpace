package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * 需求：
 *  定义一个日期类，可以表示年月日信息
 *  如果调用无参构造器，默认创建的日期为1970-1-1
 *  除了调用无参构造方法外，可以调用有参构造方法来创建日期对象
 * @Author rong.wang
 * @Date 2020/6/8
 **/

public class ThisTest01 {
    public static void main(String[] args) {
        DateTest dateTest = new DateTest(1989, 10, 13);
        dateTest.time();

        DateTest dateTest1 = new DateTest();
        dateTest1.time();
    }
}

class  DateTest{
    int year;

    int month;

    int day;

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

    /*
        通过当前的构造方法去掉本类中其他的构造方法，提高代码复用
        this();必须是构造器中第一行语句，且只能有一行
     */
    public DateTest() {
        this(1970,1,1);

//        this.year = 1970;
//        this.month = 1;
//        this.day = 1;
    }

    public DateTest(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void time(){
        System.out.println("时间是："+year+"-"+month+"-"+day);
    }
}
