package com.bilibili.demo.抽象类;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:一个类可以实现多个接口
 *
 * 无论向上转型还是向下转型，两者都要有继承关系
 * @Author rong.wang
 * @Date 2020/6/30
 **/

public class InterfaceTest03 {
    public static void main(String[] args) {

        //实现多个接口多态的写法
        D d = new G();
        d.m1();

        //经测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转
        //但是注意：运行时可能出现类型转换异常
        //这个编译和运行都没有问题，因为对象都是G类型
        E e = (E) d;
        e.m2();

        if (d instanceof E){
            E e2 = (E) d;
            e.m2();
        }

        //运行会出现类型转换异常
        //此时K和M没有关系,编译没问题，运行时报类型转换异常
        M m=new Z();
        K k = (K) m;

    }
}

//接口和接口之间支持多继承
interface D{
    void m1();
}

interface E{
    void m2();
}

interface F extends D{}

/**
 * 一个类可以实现多个接口
 *
 * java类可以实现多个接口，弥补了java类只支持单继承的缺陷
 */
class G implements D,E,F{
    @Override
    public void m1() {
        System.out.println("m1 执行");
    }

    @Override
    public void m2() {
        System.out.println("m2 执行");
    }
}

interface K{}

interface M{}

class Z implements M{}