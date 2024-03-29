package com.study.thread;

import org.testng.annotations.Test;

/**
 * Xml实现多线程测试，了解各标签的含义和用法
 * 不同的test标签下的用例可以在不同的线程下执行
 * @author rong.wang
 * @date 22:19  2019/12/30
 */
public class TestThread2 {
    @Test
    public void test1(){
        //获取进程的ID
        System.out.println("ID:"+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        //获取进程的ID
        System.out.println("ID:"+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        //获取进程的ID
        System.out.println("ID:"+Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        //获取进程的ID
        System.out.println("ID:"+Thread.currentThread().getId());
    }
}
