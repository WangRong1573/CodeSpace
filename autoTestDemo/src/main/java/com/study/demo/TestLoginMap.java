package com.study.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rong.wang
 * @date 19:18  2019/12/29
 */
public class TestLoginMap {

    @Test(dataProvider = "testLoginMap")
    public void testLoginMap(Map<String,String> map){
        System.out.println(map);
    }

    @DataProvider(name = "testLoginMap")
    public Object[][] testLoginMap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("xiaoqiang","1245");
        map.put("rong.wang","1245366");
        map.put("xiaofana","12459998");
        return new Object[][]{
                {map}
        };
    }
}
