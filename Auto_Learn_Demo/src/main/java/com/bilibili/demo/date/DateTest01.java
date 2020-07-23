package com.bilibili.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * 知识点1：怎么获取系统当前时间
 * 知识点2：String-->Date
 * 知识点3：Date-->String
 * @Author rong.wang
 * @Date 2020/7/23
 **/

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); //Thu Jul 23 20:31:23 CST 2020

        //日期格式化
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss SSS");
        String s = dateFormat.format(date);
        System.out.println(s);

        //假设现在有一个日期字符串，怎么转换成date类型？
        String time = "2020-7-23 20:47:50";
        SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式不能随便写，要和日期字符串格式相同,格式不一致时：java.text.ParseException异常
        try {
            Date parse = sft.parse(time);
            System.out.println(parse); //Thu Jul 23 20:47:50 CST 2020
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //自1970年1月1日到现在时间的毫秒数
        long millis = System.currentTimeMillis();
        System.out.println(millis);

        //需求：统计一个方法耗时
        //调用之前获取一次当前时间的毫秒数，调用后再次统计毫秒数，取两者差值
        long firstTime = System.currentTimeMillis();
        //test();
        long secondTime = System.currentTimeMillis();
        System.out.println(firstTime);
        System.out.println(secondTime);
        System.out.println("方法执行耗时为："+ (secondTime-firstTime));


        //通过毫秒数来构建Date对象
        Date d = new Date(1);//1毫秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s1 = simpleDateFormat.format(d);
        System.out.println(s1);

        //获取昨天的此刻时间
        //1.获取当前时间毫秒数-24*60*60*1000
        long millis1 = System.currentTimeMillis();
        long seconds = 24*60*60*1000;
        long dateSeconds=millis1-seconds;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
        String s2 = sdf.format(dateSeconds);
        System.out.println(s2);
    }

    public static void test(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
