package com.bjpowernode.ba02;

import org.aspectj.lang.annotation.AfterReturning;
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
     * 前置通知
     */
    @Before(value = "execution(* *..ba01.SomeServiceImpl.doSome(..))")
    public void myBefore(){
        System.out.println("前置通知，模拟增加日志时间功能："+new Date());
    }

    @AfterReturning(value = "execution(* *..ba02.SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("目标方法执行后返回的结果是："+res);
    }
}
