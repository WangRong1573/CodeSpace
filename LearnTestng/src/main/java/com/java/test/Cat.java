package com.java.test;

/**
 * @author rong.wang
 * @date 20:54  2020/3/10
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }

    @Override
    public void run() {
        System.out.println("猫捉老鼠");
    }

    @Override
    public void sleep() {
        System.out.println("猫喜欢白天在太阳下睡觉");
    }
}
