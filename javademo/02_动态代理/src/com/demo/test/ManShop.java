package com.demo.test;

import com.demo.factory.KingFactory;
import com.demo.handler.MyInvocationHandler;
import com.demo.service.Sell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/15
 **/

public class ManShop {
    public static void main(String[] args) {
        //1.创建目标对象
        Sell factory = new KingFactory();
        //2.创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(factory);

        //3.创建代理对象
        Sell proxyInstance = (Sell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);

        //4.通过代理执行方法
        float price = proxyInstance.sell(1);
        System.out.println("通过动态代理执行方法："+price);
    }
}
