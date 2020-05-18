package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/5/12
 **/

public class ForTest01 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 1; i <=100 ; i+=2) {
            sum=sum+i;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
