package com.test.demo;


import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:编写一个方法，输出大于某个正整数n的最小的质数的值
 * @Author rong.wang
 * @Date 2020/5/26
 **/

public class HomeWork2 {
    public static void main(String[] args) {
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork2.print();
    }

    void print(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int i = scanner.nextInt();

        while (true){
            i++;
            //标记是否是质数
            boolean flag=isZhishu(i);
            if (flag){
                System.out.println("大于您输入值的最小质数为："+i);
                break;
            }
        }

    }

    //判断一个数是否是质数，是返回true，不是返回false
    public static boolean isZhishu(int num){
        //对比数值小的所有数值循环取余数，如果余数为0，则说明不是质数
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
