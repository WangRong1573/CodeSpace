package com.java.test;

/**
 * @author rong.wang
 * @date 21:55  2020/3/10
 */
public class TestPerson {
    public static void main(String[] args) {
        //多态之父类引用指向子类对象
        Person p1=new Chinese();
        p1.say();
        //多态的使用前提是必须有继承关系
        Person p2=new American();
        p2.say();
    }
}
