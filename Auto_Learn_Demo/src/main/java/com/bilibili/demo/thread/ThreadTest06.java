package com.bilibili.demo.thread;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: sleep方法面试题
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class ThreadTest06 {
    public static void main(String[] args) {

        MyThreadTest test = new MyThreadTest();
        test.setName("t");
        test.start();

        try {
            //问题：这行代码会让线程test休眠3秒吗？
            test.sleep(3000);
            //在执行的时候，因为是静态方法，与对象无关，在执行的时候还是会替换成Thread.sleep
            //这行代码的作用是让当前线程休眠3秒，也就是main线程
            //这行代码出现在main方法中，main线程休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello world");
    }
}

class MyThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
