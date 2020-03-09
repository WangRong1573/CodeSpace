package com.demo.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rong.wang
 * @date 20:32  2020/3/9
 * map形式写法实现参数化测试
 */
public class TestParameters2 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("准备参数中");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("数据切换");
    }

    @Test(dataProvider = "testMap")
    public void testLogin(Map<String,String> map){
        System.out.println(map);
    }

    @DataProvider(name = "testMap")
    public Object[][] testMap(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("zhangsan","123456");
        map.put("","123456");
        map.put("lisi","");
        map.put("wangwu","182457326");
        return new Object[][]{
                {map}
        };
    }

}
