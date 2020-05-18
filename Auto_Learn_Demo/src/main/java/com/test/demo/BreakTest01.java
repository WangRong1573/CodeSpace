package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:break
 * @Author rong.wang
 * @Date 2020/5/13
 **/

public class BreakTest01 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i==5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("---------------");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if (j==5){
                    break;
                }
                System.out.println(j);
            }
        }
    }
}
