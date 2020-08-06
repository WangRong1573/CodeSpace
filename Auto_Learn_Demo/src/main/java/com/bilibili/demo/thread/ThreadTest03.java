package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 匿名内部类方式实现
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程" + i);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程" +i);
        }
    }
}
