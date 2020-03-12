package com.demo.testng;

import org.testng.annotations.*;

public class TestParam {
    @BeforeTest
    public void beforeTest(){
        System.out.println("数据准备中");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("数据切换");
    }

    @Test(dataProvider = "test")
    public void testParam(String username,String password){
        System.out.println("username:"+username+"\t"+"password:"+password);
    }

    @DataProvider
    public Object[] test(){

        return new Object[][]{
                {"xiaoqing","123456"},
                {"xiaoming","111111111111111111"},
                {"#$^&","5254444"}
        };
    }
}
