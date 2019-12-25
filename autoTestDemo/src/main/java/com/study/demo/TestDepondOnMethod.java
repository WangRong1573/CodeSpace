package com.study.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 依赖测试
 * @author rong.wang
 * @date 22:24  2019/12/25
 */
public class TestDepondOnMethod {
    @BeforeClass
    public void beforeClass(){
        System.out.println("登陆数据库");
    }

    @Test
    public void test1(){
        System.out.println("链接库操作");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("初始化对象并操作");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("关闭连接");
    }
}
