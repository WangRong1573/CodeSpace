package com.frame.demo.utils;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class BaseInfo {
    public static String getBaseInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String string = config.getString(key);
        return string;
    }

//    @Test
//    public void testBaseInfo(){
//        String broName = getBaseInfo("browerName");
//        System.out.println(broName);
//    }
}
