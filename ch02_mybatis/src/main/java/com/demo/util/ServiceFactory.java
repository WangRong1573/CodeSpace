package com.demo.util;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

public class ServiceFactory {

    //传递zs对象取得ls对象
    public static Object getService(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
