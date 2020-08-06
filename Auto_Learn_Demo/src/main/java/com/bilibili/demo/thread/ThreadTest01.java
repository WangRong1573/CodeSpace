package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 多线程学习
 * 什么是进程？什么是线程
 * 进程是一个应用程序，比如像是一个公司
 * 线程是程序的一个应用场景，比如一个公司的员工
 *
 * 同一进程的各个线程 堆和方法区内存是共享的，但是栈内存是独立的，会分别开辟栈空间
 *
 *
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest01 {
    public static void main(String[] args) {
        Student s = new Student();
        //启动线程
        s.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程：" +i);
        }
    }
}

//多线程的两种方式：继承Thread
class Student extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程---"+i);
        }
    }
}
