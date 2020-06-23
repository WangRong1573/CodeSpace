package com.bilibili.demo.super学习;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:简单计算器实现
 *
 * @Author rong.wang
 * @Date 2020/6/23
 **/

public class Homework02 {
    public static void main(String[] args) {

        Number number = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值：");
        int n1 = scanner.nextInt();

        System.out.println("请输入第二个值：");
        int n2=scanner.nextInt();
        number.setN1(n1);
        number.setN2(n2);
        System.out.println("运算后的结果为："+number.addition());
    }
}

class Number{

    private int n1;

    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    /*加法*/
    public int  addition(){
        return n1+n2;
    }

    /*减法*/
    public int subtraction(){
        return n1-n2;
    }

    /*乘法*/
    public int multiplication(){
        return n1*n2;
    }

    /*除法*/
    public double division(){
        if (n2==0){
            System.out.println("除数不能为0，请正确输入");
        }
        return n1/n2;
    }
}
