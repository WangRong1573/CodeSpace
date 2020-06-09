package com.bilibili.demo.oo.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:银行账户类练习面向对象
 * @Author rong.wang
 * @Date 2020/6/9
 **/

public class Homework04 {
    public static void main(String[] args) {

        Account02 account02 = new Account02("6222888888888", 2000);
        Customer2 customer2 = new Customer2("小强", account02);

        System.out.println("账户余额："+customer2.getAct2().getBalance());

        customer2.getAct2().saveMoney(1000);
        System.out.println("账户余额："+customer2.getAct2().getBalance());

        customer2.getAct2().withdraw(100);

        customer2.getAct2().withdraw(960);

        customer2.getAct2().withdraw(2000);
    }
}

class Account02{

    //银行卡号
    private String id;

    //余额
    private double balance;

    //年利率
    private double liLv;

    public Account02() {
    }

    public Account02(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLiLv() {
        return liLv;
    }

    public void setLiLv(double liLv) {
        this.liLv = liLv;
    }

    //存钱方法，需要传一个参数money来表示存了多少钱到当前账户
    public void saveMoney(int money){
        System.out.println("成功存钱："+money);
        balance=balance+money;
        //或者：this.setBalance(this.getBalance()+money);
    }

    //取钱方法，需要传一个参数money来表示从当前账户取了多少钱
    public void withdraw(int money){
        //需要判断money是否大于余额，如果大于则取钱失败
        if (money>this.getBalance()){
            System.out.println("取钱失败");
            System.out.println("账户余额："+this.getBalance());
            return;
        }
        //当money<余额时，取钱成功
        System.out.println("成功取钱："+money);

        balance-=money;
        System.out.println("账户余额："+this.getBalance());
    }
}

//顾客类
class Customer2{

    private String name;

    //账户
    private Account02 act2;

    public Customer2() {
    }

    public Customer2(String name, Account02 act2) {
        this.name = name;
        this.act2 = act2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account02 getAct2() {
        return act2;
    }

    public void setAct2(Account02 act2) {
        this.act2 = act2;
    }
}