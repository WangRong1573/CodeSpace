package com.login.demo.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:通过配置文件读取浏览器类型
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class BaseInfo {
    public static String getInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String string = config.getString(key);
        return string;
    }

}
