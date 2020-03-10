package com.java.test;

/**
 * @author rong.wang
 * @date 20:52  2020/3/10
 */
public class Dog extends Animal implements Run {
    @Override
    public void eat() {
        System.out.println("狗是吃肉的");
    }

    @Override
    public void run() {
        System.out.println("狗跑的很快");
    }

    @Override
    public void sleep() {
        System.out.println("狗白天睡觉");
    }
}
