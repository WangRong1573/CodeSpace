package com.bjpowernode.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/29
 **/

@Aspect
public class MyAspect {

    /**
     * 环绕通知
     * 1.public
     * 2.必须有一个返回值，推荐使用Object
     * 3.方法名称自定义
     * 4.方法必须有一个参数，固定参数ProceedingJoinPoint
     * @param pjp
     * @return
     */
    @Around(value = "execution(* *..ba03.SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("模拟增加时间功能"+new Date());
        Object obj = pjp.proceed();
        String result = (String) obj;
        System.out.println("模拟提交事务");
        return result;
    }
}
