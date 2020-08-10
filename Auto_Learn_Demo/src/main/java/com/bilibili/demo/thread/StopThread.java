package com.bilibili.demo.thread;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 合理终止线程
 * @Author rong.wang
 * @Date 2020/8/10
 **/

public class StopThread {
    public static void main(String[] args) {

        MyThread3 t = new MyThread3();
        Thread thread = new Thread(t);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.flag = false;
    }
}

class MyThread3 implements Runnable {

    boolean flag = true;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (flag) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}
