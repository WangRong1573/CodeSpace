package com.bilibili.demo.super学习;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:举个例子，在恰当的时机使用super(实参)
 * 在方法执行的过程中一连串的调用了父类的构造方法
 * 父类的构造方法又调用了其父类的无参构造方法，但实际上只创建了一个对象
 *
 * super（实参）的作用：
 * 初始化当前对象的父类型特征，并不是创建对象，实际上对象只创建了一个
 *
 * super关键字：代表的就是“当前对象”的那部分父类型特征
 *例如：
 *      我从父类中继承了“鼻子，眼睛”
 *      super代表的就是“鼻子，眼睛”，虽然是继承了父类的，但是这部分是在我身上的；
 * @Author rong.wang
 * @Date 2020/6/22
 **/

public class SuperTest01 {
    public static void main(String[] args) {
        CreditAccount act1 = new CreditAccount();
        System.out.println(act1.getName()+"\t"+act1.getBalance()+"\t"+act1.getCredit());

        CreditAccount act2 = new CreditAccount("Jack", 6666.6, 0.69);
        System.out.println(act2.getName()+"\t"+act2.getBalance()+"\t"+act2.getCredit());
    }
}

class Account{

    private String name;

    private double balance;

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CreditAccount extends Account{

    private double credit;

    public CreditAccount() {
    }

    public CreditAccount(String name, double balance, double credit) {
        //此处是关键
        super(name, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
