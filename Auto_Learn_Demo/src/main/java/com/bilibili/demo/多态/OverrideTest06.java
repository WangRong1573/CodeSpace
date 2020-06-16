package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:静态方法在多态发生时，不存在方法的重写
 * @Author rong.wang
 * @Date 2020/6/16
 **/

public class OverrideTest06 {
    public static void main(String[] args) {
        Book b=new ManHua();
        //静态方法可以是用对象来调用，但是与对象无关，会自动替换成“类名.”
        b.DoSome();
    }
}

class Book{
    public static void DoSome(){
        System.out.println("父类的静态方法执行");
    }
}

class ManHua extends Book{
    public static void DoSome(){
        System.out.println("子类的静态方法执行");
    }
}
