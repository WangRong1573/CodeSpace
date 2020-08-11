package com.bilibili.demo.thread.exam3;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class Test {
    public static void main(String[] args) {
        Account act = new Account("100201", 10000);

        //两个线程共享对象act
        AccountThread t1 = new AccountThread(act);
        AccountThread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        //此处为了让t1先执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

    }
}
