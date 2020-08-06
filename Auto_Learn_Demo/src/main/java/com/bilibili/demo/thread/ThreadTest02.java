package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 线程实现的第二种方式：实现Runnable接口，实现run方法
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest02 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程==="+i);
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程启动---"+i);
        }
    }
}
