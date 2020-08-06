package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * 怎么获取  当前线程对象  public static Thread currentThread()
 *  Thread t = Thread.currentThread()
 * 获取线程对象的名字  thread.getName()
 * 修改线程对象的名字  thread.getName()
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest04 {
    public static void main(String[] args) {

        //出现在main方法中，所以当前线程就是主线程
        Thread thread2 = Thread.currentThread();
        System.out.println(thread2.getName());//main

        Thread thread = new Thread(new MyRunnable2());

        System.out.println(thread.getName()); //Thread-0

        thread.setName("我的线程名字");

        System.out.println(thread.getName()); //我的线程名字

        Thread thread1 = new Thread(new MyRunnable2());
        System.out.println(thread1.getName());//Thread-1

        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程： "+i);
        }
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //如果是t1线程执行run方法，当前为t1;t2线程执行run方法，当前为t2
            String name = Thread.currentThread().getName();
            System.out.println("线程名字" +name);
        }
    }
}
