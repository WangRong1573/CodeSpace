package com.bilibili.demo.string;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:string类及方法的练习
 * @Author rong.wang
 * @Date 2020/7/23
 **/

public class StringTest01 {
    public static void main(String[] args) {
        //字符串存储在方法区，字符串常量池当中，一旦声明，不可改变
        //因为底层是一个byte[] 数组，被final修饰，因为数组内容是不可变的，所以string也是不可变的
        String x = "123";
        String y = "123";
        System.out.println(x ==y); //true

        String x1 = new String("123");
        String y1 = new String("123");
        System.out.println(x1 == y1); //false

        //字符串的比较使用equals()方法
        System.out.println(x1.equals(y1)); //true因为"123"在字符串常量池中，x1和y1都指向这个字符串

        //判断字符串是否包含某个子字符串
        boolean contains = x1.contains("1");
        System.out.println(contains);

        //字符串的分割
        String param = "       name=xiaoming&age=20&height=180            ";
        String[] strings = param.split("&");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //判断字符串是否以子字符串开头/结尾
        boolean b = param.endsWith("0");
        boolean nam = param.startsWith("nam");
        System.out.println(nam);
        System.out.println(b);

        //字符串的截取，从index开始到index-1结束，左闭右开
        String s = param.substring(7);
        String s1 = param.substring(7, 10);
        System.out.println(s);
        System.out.println(s1);

        //字符串 第一次/最后一次 出现的位置索引
        int index = param.indexOf("ming");
        int i = param.lastIndexOf("i");
        System.out.println(index);
        System.out.println(i);

        //返回索引位置的字符串元素
        char c = param.charAt(0);
        System.out.println(c);

        String replace = param.replace("xiaoming", "john");
        System.out.println(replace);

        //去掉字符串的 首尾 空格，中间部分不会去除
        String trim = param.trim();
        System.out.println(trim);
    }
}
