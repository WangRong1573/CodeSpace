package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:for循环嵌套for循环
 * @Author rong.wang
 * @Date 2020/5/12
 **/

public class ForTest02 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            //循环体中可以编写其他控制语句
            //控制语句可以是：if,if..else,switch,for,while,do...while
            System.out.println("i=="+i);

            //当嵌套时
            for (int j = 0; j <3 ; j++) {
                System.out.println("j=="+j);

                for (int k = 0; k <3 ; k++) {
                    System.out.println("k=="+k);
                }
            }
            System.out.println("-------------");
        }

    }
}
