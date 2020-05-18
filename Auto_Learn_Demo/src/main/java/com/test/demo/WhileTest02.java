package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:使用while循环输出1-10,i++先赋值再自增，++i先自增再赋值
 * @Author rong.wang
 * @Date 2020/5/13
 **/

public class WhileTest02 {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("--------");

        //输出10-1
        int j=10;
        while (j>0){
            System.out.println(j--);
        }
        System.out.println("--end--"+j);

        //9 - -1
        int k=10;
        while (k>=0){
            System.out.println(--k);
        }
        System.out.println("end-->"+k);
    }
}
