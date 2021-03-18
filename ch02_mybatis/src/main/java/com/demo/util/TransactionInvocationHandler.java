package com.demo.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/18
 **/

//代理工具类
public class TransactionInvocationHandler implements InvocationHandler {
    private Object target;

    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    //代理类的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;

        try {
            session = SqlSessionUtil.getSession();
            //处理业务逻辑
            //目标类的方法
            obj = method.invoke(target,args);
            //处理业务逻辑完毕，提交事务
            session.commit();
        }catch (Exception e){
            //发生异常，事务回滚
            session.rollback();
            e.printStackTrace();
        }finally {
            SqlSessionUtil.myClose(session);
        }
        return obj;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
