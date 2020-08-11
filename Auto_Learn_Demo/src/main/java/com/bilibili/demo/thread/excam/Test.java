package com.bilibili.demo.thread.excam;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 测试类
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class Test {
    public static void main(String[] args) {
        Account act = new Account("10001", 10000);

        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
//        运行结果：
//        t1取款5000.0成功，余额：5000.0
//        t2取款5000.0成功，余额：5000.0



    }
}
