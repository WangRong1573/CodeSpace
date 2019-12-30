package com.study.demo;

import org.testng.annotations.Test;

/**
 * Xml实现多线程测试，了解各标签的含义和用法
 * @author rong.wang
 * @date 22:19  2019/12/30
 */
public class TestThread {
    @Test
    public void test1(){
        //获取进程的ID
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        //获取进程的ID
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        //获取进程的ID
        System.out.println(Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        //获取进程的ID
        System.out.println(Thread.currentThread().getId());
    }
}
