package com.bilibili.demo.thread.deadlock;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 死锁
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        MyTest1 t1 = new MyTest1(o1, o2);
        MyTest2 t2 = new MyTest2(o1, o2);

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyTest1 extends Thread{

    //共享对象
    Object o1;
    Object o2;

    public MyTest1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}

class MyTest2 extends Thread{
    Object o1;
    Object o2;

    public MyTest2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}