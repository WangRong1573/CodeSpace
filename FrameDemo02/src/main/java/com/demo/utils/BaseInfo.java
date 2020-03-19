package com.demo.utils;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/18
 **/

public class BaseInfo {
    public static String getInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String string = config.getString(key);
        return string;
    }

    @Test
    public void test(){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        System.out.println(config.getString("broName"));
    }
}
