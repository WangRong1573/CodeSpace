package com.bilibili.demo.thread.exam3;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 线程类，模拟多线程对账户取款操作
 * 1.继承Thread类重写run方法
 * 2.实现Runnable接口，实现run方法
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class AccountThread extends Thread {

//    线程共享对象
    Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;

        //调用取钱方法
        account.withdraw(money);

        System.out.println(Thread.currentThread().getName()+"成功对"+account.getNo()+"账户取钱"+money+"账户余额："+account.getBalance());
    }
}
