package com.demo.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/15
 **/

//实现InvocationHandler接口，完成代理类需要完成的功能
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    //动态代理，目标类是活动的，需要传入进来，传入的是谁，就给谁创建代理
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行目标方法
        Object res = method.invoke(target, args);

        //功能增强
        if (res != null){
            float price = (float) res;
            res = price + 25;
        }

        System.out.println("获得了优惠券");
        return res;
    }
}
