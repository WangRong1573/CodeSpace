package com.frame.utils;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:工具类，用于读取配置文件
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class BaseInfo {
    public static String getInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String name = config.getString(key);
        return name;
    }

    @Test
    public void testInfo(){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String name = config.getString("broName");
        System.out.println(name);
    }
}
