package com.bilibili.demo.super学习;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:猜数字游戏
 * @Author rong.wang
 * @Date 2020/6/23
 **/

public class SuperTest04 {
    public static void main(String[] args) {
        A a = new A(100);
        B b = new B(a);
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("开始猜数字吧");
            int i = scanner.nextInt();
            b.caiCe(i);
        }
    }
}

class A{

    int num;

    public A() {
    }

    public A(int num) {
        this.num = num;
    }
}

class B{
    private A a;

    public B() {
    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void caiCe(int caiCeZhi){
        if (caiCeZhi==a.num){
            System.out.println("you guess it");
            //退出JVM
            System.exit(0);
        }else if (caiCeZhi>a.num){
            System.out.println("this num is small than your guess");
        }else {
            System.out.println("this num is bigger than you guess");
        }
    }
}
