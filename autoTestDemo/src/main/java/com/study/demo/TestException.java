package com.study.demo;

import org.testng.annotations.Test;

/**
 * 异常测试
 * @author rong.wang
 * @date 21:31  2019/12/25
 */
public class TestException {

    //指测试方法本应该抛出异常信息，如果抛出了则运行通过
    @Test(expectedExceptions = RuntimeException.class)
    public void testSuccess(){
        throw new RuntimeException("这是应该抛出的异常信息");
    }

    //定义测试方法应该抛出异常，未抛出异常信息会报错 should have thrown an exception of type class java.lang.RuntimeException
    @Test(expectedExceptions = RuntimeException.class)
    public void testFailed(){
        System.out.println("没有抛出异常信息");
    }

    //除数不能为0异常，如果有除数为0的异常，则运行成功
    @Test(expectedExceptions = ArithmeticException.class)
    public void testZero(){
        int i=3/0;
        //除数不为0时应该抛出异常
        int j=20/3;
    }
}
