package com.bjpowernode.ba05;

import org.aspectj.lang.annotation.After;
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
     * 最终通知
     * 1.public
     * 2.没有返回值
     * 3.方法名自定义
     * 4.没有参数，如果有就是JoinPoint
     *
     * 参数：
     * value：切入点表达式
     *
     * 在目标方法执行之后，总是会执行
     */

    @After(value = "execution(* *..ba05.SomeServiceImpl.doSecond(..))")
    public void myAfter(){
        System.out.println("最终通知执行了");
    }
}
