package com.study.demo;

import org.testng.annotations.Test;

/**
 * 利用xml实现分组测试
 * @author rong.wang
 * @date 21:05  2019/12/25
 */
public class TestGroups {
    @Test(groups = "group1")
    public void test(){
        System.out.println("我是1组同学");
    }
    @Test(groups = "group2")
    public void test2(){
        System.out.println("我是2组同学");
    }
    @Test(groups = "group1")
    public void test3(){
        System.out.println("我是1组同学");
    }
    @Test(groups = "group2")
    public void test4(){
        System.out.println("我是2组同学");
    }
    @Test(groups = "group1")
    public void test5(){
        System.out.println("我是1组同学");
    }
    @Test(groups = "group1")
    public void tes6(){
        System.out.println("我是1组同学");
    }
    @Test(groups = "group1")
    public void test7(){
        System.out.println("我是1组同学");
    }
    @Test(groups = "group2")
    public void test8(){
        System.out.println("我是2组同学");
    }
}
