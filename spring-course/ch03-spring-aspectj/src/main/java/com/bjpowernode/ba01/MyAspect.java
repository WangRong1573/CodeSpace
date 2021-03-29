package com.bjpowernode.ba01;

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
}
