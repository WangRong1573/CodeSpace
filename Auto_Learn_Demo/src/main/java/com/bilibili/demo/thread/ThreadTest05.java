package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 线程的sleep方法
 * 1.静态的 Thread.sleep(毫秒数);
 * 2.作用：让当前线程进入休眠，放弃占用的cpu时间片，让给其他线程使用
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest05 {
    public static void main(String[] args) {
        //主线程暂停3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "-->" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
