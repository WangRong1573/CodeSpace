package com.demo.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam2 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("数据加载中");
    }

    @Test
    @Parameters({"username","password"})
    public void testParam2(String username,String password){
        System.out.println("username:"+username+"\t"+"password:"+password);
    }
}
