package com.study.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 参数化测试--Map写法
 * @author rong.wang
 * @date 20:02  2019/12/28
 */
public class TestParameter3 {
    @Test(dataProvider = "testMap")
    public void testMap(Map<String,String> map){
        System.out.println(map);
    }

    @DataProvider(name = "testMap")
    public Object[][] testMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("xiaoqin","123487");
        map.put("","12342255");
        map.put("xiaoqinddddd","");
        map.put("daqiang","123487");
        return new Object[][]{
                {map},
        };
    }
}
