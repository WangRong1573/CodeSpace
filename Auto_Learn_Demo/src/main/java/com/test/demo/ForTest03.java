package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:for嵌套
 * @Author rong.wang
 * @Date 2020/5/12
 **/

public class ForTest03 {
    public static void main(String[] args) {
//        for (int i = 0; i <10 ; i++) {
//            //代码片段执行i 的最大值遍
//            System.out.println("begin");
//            for (int j = 0; j <1 ; j++) {
//                System.out.println("j--"+j);
//            }
//            System.out.println("over");
//        }

        //demo02
        for (int i = 0; i <=5 ; i++) {
            System.out.println("开始");
            for (int j = 0; j <=5 ; j++) {
                System.out.println(i*j);
            }
            System.out.println("结束");
        }
    }
}
