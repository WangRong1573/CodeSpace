package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class T {
    A a1;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        T t = new T();

        c.d1=d;
        b.c1=c;
        a.b1=b;
        t.a1=a;

        System.out.println(t.a1.b1.c1.d1.i);
    }
}

class A{
    B b1;
}

class B{
    C c1;
}

class C{
    D d1;
}

class D{
    int i=10086;
}
