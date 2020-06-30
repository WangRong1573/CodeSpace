package com.bilibili.demo.抽象类;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:接口和多态的联合使用
 * @Author rong.wang
 * @Date 2020/6/30
 **/

public class InterfaceTest02 {
    public static void main(String[] args) {
        //接口无法被实例化
        //MyMath myMath = new MyMath();

        //编译的时候找的是接口里的方法，如果有则编译通过，没有则编译不通过
        //指向子类对象，多态，运行时指向实现类对象的方法，找到了则运行，找不到报错
        MyMath mm = new MyMathImpl();
        int sum = mm.sum(1, 2);
        System.out.println(sum);

        int sub = mm.sub(1, 2);
        System.out.println(sub);
    }
}

interface MyMath{

    double PI=3.14;

    int sum(int a,int b);

    int sub(int a,int b);
}

class MyMathImpl implements MyMath{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
