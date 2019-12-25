package com.study.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 依赖测试--分组测试
 * @author rong.wang
 * @date 22:31  2019/12/25
 */
public class TestDependOnGroups {
    @BeforeClass
    public void login(){
        System.out.println("这是登录操作");
    }

    @Test(groups = "taobao")
    public void loginTaobao(){
        System.out.println("在淘宝上买东西");
    }

    @Test(groups = "jingdong")
    public void loginJingdong(){
        System.out.println("在京东上买东西");
    }

    @Test(dependsOnMethods = "loginTaobao",dependsOnGroups = "taobao")
    public void shopping(){
        System.out.println("支付下单");
    }

    @AfterClass
    public void quit(){
        System.out.println("买完了坐等收快递");
    }
}
