package com.bilibili.demo.oo.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:银行账户类练习
 * @Author rong.wang
 * @Date 2020/6/8
 **/

public class HomeWork03 {
    public static void main(String[] args) {

        Account account = new Account("1008611", 2000, 1.23);
        Customer customer = new Customer(account, "john");
        customer.getAccount().deposit(100);
    }
}

class Account{
    private String id;

    private double balance;

    //年利率
    private double AnnualInterestRate;

    public Account() {
    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        AnnualInterestRate = annualInterestRate;
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

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    //取钱方法：传一个参数：要取多少钱
    public void withdraw(double money){
        //向this指向的对象中取款
        if (money>this.getBalance()){
            System.out.println("余额不足，取钱失败");
            return;
        }
        this.balance-=money;
//        this.setBalance(this.getBalance()-money);
    }

    //存款方法：传一个参数：要存多少钱
    public void deposit(double money){
        //向this指向的对象中存款
        this.balance +=money;
//        this.setBalance(this.getBalance()+money);
    }
}

class Customer{

    private Account account;

    private String name;

    public Customer() {
    }

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
