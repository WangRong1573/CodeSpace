package com.bjpowernode.ba06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

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

    @After(value = "myPointcut()")
    public void myAfter(){
        System.out.println("最终通知执行了");
    }

    @Before(value = "myPointcut()")
    public void myBefore(){
        System.out.println("前置通知执行了");
    }

    /**
     * @Pointcut 定义和管理切入点，当项目中有多个切入点表达式一致时使用
     * 属性：value 切入点表达式
     * 位置：在方法的上面
     *
     * 特点：
     * 使用@Pointcut定义在一个方法的上面，那么这个方法的名称就是切入点表达式的别名
     * 其他通知中的切入点表达式就可以使用这个方法（）来表示了，不要忘记小括号！！！
     */
    @Pointcut(value = "execution(* *..ba06.SomeServiceImpl.doSecond(..))")
    public void myPointcut(){
        //无需代码
    }
}
