package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/5/26
 **/

public class OverLoadTest01 {
    public static void main(String[] args) {
        sum(10,20);

        sum(10L,20L);

        sum(10.0,20.0);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public static Long sum(Long a,Long b){
        return a+b;
    }
}
