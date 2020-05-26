package com.test.demo;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:升级版
 * @Author rong.wang
 * @Date 2020/5/26
 **/

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int i = scanner.nextInt();
        HomeWork3 homeWork3 = new HomeWork3();
        homeWork3.print(i);
    }

    void print(int n){
        while (!isZhishu(++n)){
        }
        System.out.println("大于输入值的最小质数为："+n);
    }

    public static boolean isZhishu(int num){
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
