package com.study.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试
 * @author rong.wang
 * @date 19:17  2019/12/28
 */
public class TestParam {
    @Parameters({"username","password"})
    @Test
    public void testLogin(String username,String password){
        System.out.println(username+"\t"+password);
    }
}
