package com.java.test;

/**
 * @author rong.wang
 * @date 20:46  2020/3/10
 */
public class Animal implements Run {
    public int age=10;
    public String name="xiaoming";

    public void eat(){
        System.out.println("动物具有吃的能力");
    }

    public void run() {
        System.out.println("动物能够奔跑");
    }

    public void sleep() {
        System.out.println("动物睡觉");
    }
}
