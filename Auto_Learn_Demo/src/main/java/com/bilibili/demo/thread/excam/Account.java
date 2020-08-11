package com.bilibili.demo.thread.excam;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 编写程序：利用多线程模拟同时对一个账户进行取款操作，获取余额
 *  测试多线程并发情况下，会发生错误
 * @Author rong.wang
 * @Date 2020/8/10
 **/

public class Account {

    String no;

    double balance;

    public Account() {
    }

    public Account(String no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "no='" + no + '\'' +
                ", balance=" + balance +
                '}';
    }

    //取款方法
    public void withdraw(double money){
        //取款前余额
        double before = this.getBalance();

        //取款后余额
        double after = before - money;

        //模拟网络延迟
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setBalance(after);
    }
}
