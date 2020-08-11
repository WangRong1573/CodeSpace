package com.bilibili.demo.thread.exam3;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: synchronize修饰方法等同于synchronize线程同步代码块，线程同步机制，牺牲一部分效率
 *  缺点：synchronize修饰方法表示整个方法都进行线程同步，可能会降低效率
 *  同步代码块语法：
 *      synchronize(共享对象){
 *          //代码越少效率越高
 *      }
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
    public synchronized void withdraw(double money) {

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
