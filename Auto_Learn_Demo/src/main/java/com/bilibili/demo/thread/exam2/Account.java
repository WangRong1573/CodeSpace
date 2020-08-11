package com.bilibili.demo.thread.exam2;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 使用线程同步代码块解决线程安全问题，synchronize，线程同步机制，牺牲一部分效率
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class Account {
    private String no;

    private double balance;

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

    /**
     * 取款方法
     *
     * @param money 表示取钱数量
     */
    public void withdraw(double money) {

        synchronized (this) {

            //取款前账户余额
            double before = this.getBalance();

            //取款后余额
            double after = before - money;

            //模拟网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //账户余额
            this.setBalance(after);
        }

    }
}
