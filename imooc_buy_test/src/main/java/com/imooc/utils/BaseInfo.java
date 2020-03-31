package com.imooc.utils;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:读取配置文件判断浏览器类型
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class BaseInfo {
    public static String getInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);

        return config.getString(key);
    }
}
