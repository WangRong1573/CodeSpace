package com.bilibili.demo.thread.excam;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 两个线程对账户取钱
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class AccountThread  extends Thread{

    Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);

        System.out.println(Thread.currentThread().getName()+"取款"+money+"成功，余额："+account.getBalance());
    }
}
