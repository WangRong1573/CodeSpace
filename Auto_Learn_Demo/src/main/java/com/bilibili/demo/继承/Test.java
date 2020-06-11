package com.bilibili.demo.继承;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:继承的学习，使用关键字extends
 * 1.当子类从父类继承来的方法（构造方法不可继承）不能满足子类的业务需求时，可以对继承的方法进行重写/覆盖，使用@override
 * 2.子类继承父类，不能直接访问从父类继承来的private属性，需要使用setter或者getter方法来访问
 * @Author rong.wang
 * @Date 2020/6/11
 **/

public class Test {
    public static void main(String[] args) {
        Account account = new Account("6222 3001 8888 8888", 88888);
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setBalance(4567.8);
        creditAccount.setNo("6001 3222 8888  9999");

        System.out.println(creditAccount.getBalance());
        System.out.println(creditAccount.getNo());
    }
}

class Account{

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

    public void withdraw(double money){
        System.out.println("取钱成功："+money);
    }
}

class CreditAccount extends Account{

    //信誉度
    private double credit;

    public void withdraw(double money){
        System.out.println("成功使用："+money+"的额度");
    }
}
