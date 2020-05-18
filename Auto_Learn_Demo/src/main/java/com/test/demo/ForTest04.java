package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:使用for循环输出99乘法表
 * @Author rong.wang
 * @Date 2020/5/12
 **/

public class ForTest04 {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
