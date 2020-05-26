package com.test.demo;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:编写一个方法，输出大于某个正整数n的最小的质数的值
 * @Author rong.wang
 * @Date 2020/5/25
 **/

public class HomeWorkTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = scanner.nextInt();
        while (true){
            n+=1;
            boolean flag = isZhiShu(n);
            if (flag){
                System.out.println("大于的最小质数为："+n);
                break;
            }

        }
    }
    public static boolean isZhiShu(int num){
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}


