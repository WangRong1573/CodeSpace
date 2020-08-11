package com.bilibili.demo.thread.watch;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 守护线程
 * 特点：
 * 一般守护线程是一个死循环，所有的用户线程只要结束，守护线程自动结束
 * 主线程main方法是一个用户线程
 *
 * 守护线程用处
 * 每天00:00自动保存
 * 每天00:00自动执行
 *
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class WatchThread {
    public static void main(String[] args) {
        Test test = new Test();

        //不调用此方法时，用户线程结束后，线程仍会继续执行
        //调用此方法传参true时表示将线程设置为守护线程，在用户线程结束时，守护线程也自动结束
        test.setDaemon(true);
        test.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Test extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (true){

            System.out.println(Thread.currentThread().getName()+"-->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
