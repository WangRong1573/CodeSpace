package com.bjpowernode.ba04;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

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
     * 异常通知
     * 1.public
     * 2.没有返回值
     * 3.方法名自定义
     * 4.方法有一个参数Exception，还可以有JoinPoint
     *
     * 参数：
     * value：切入点表达式
     * throwing：自定义变量，表示目标方法抛出的异常对象，变量名必须和方法的形参名一致
     *
     * 在目标方法有异常时才会执行
     */
    @AfterThrowing(value = "execution(* *..ba04.SomeServiceImpl.doSecond(..))",throwing = "ex")
    public void myException(Exception ex){
        System.out.println("异常通知，发生异常时才会执行"+ex.getMessage());
        //可发送邮件
    }
}
