package com.study.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 二维数组形式实现参数化测试
 * @author rong.wang
 * @date 19:32  2019/12/28
 */
public class TestParameter2 {
//    @Parameters({"userName","password"})
//    @Test
//    public void testLogin(String userName,String password){
//        System.out.println(userName+"\t"+password);
//    }

    @Test(dataProvider = "testLogin")
    public void test(String userName,String password){
        System.out.println(userName+"\t"+password);
    }
    @DataProvider
    public Object[][] testLogin(){
        return new Object[][]{
                {"xiaoqiang","125436"} ,
                {"xiaoqiang",""} ,
                {"","125436"} ,
                {"xiaofang","heollo"} ,
        };
    }
}
