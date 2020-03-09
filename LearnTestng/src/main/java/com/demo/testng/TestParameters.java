package com.demo.testng;

import org.testng.annotations.*;

/**
 * @author rong.wang
 * @date 19:55  2020/3/9
 * 参数化测试和参数化测试xml形式
 */
public class TestParameters {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

//    @Test(dataProvider = "tester1")
//    public void testLogin(String username,String password){
//        System.out.println("username:"+username+"\t"+"password:"+password);
//    }

    @Test
    @Parameters({"username","password"})
    public void testLogin2(String username,String password){
        System.out.println("username:"+username+"\t"+"password:"+password);
    }
//
//    @DataProvider
//    public Object[][] tester1(){
//        return new Object[][]{
//                {"xiaoming","123456"},
//                {"","123465"},
//                {"xiaoqiang",""},
//                {"18272691567","yucheng2017"}
//        };
//    }

}
