package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:continue和break的区别
 * @Author rong.wang
 * @Date 2020/5/14
 **/

public class ContinueTest01 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("hello world");

        for (int i = 0; i <10 ; i++) {
            if (i==5){
                continue; //只要这个语句执行，本次循环停止；直接进入下一次循环“继续执行”；
            }
            System.out.println(i);
        }
        System.out.println("hello world");
    }
}
