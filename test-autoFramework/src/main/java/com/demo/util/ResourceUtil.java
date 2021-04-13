package com.demo.util;

import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/13
 **/

public class ResourceUtil {
    public static String getHost(){
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        return bundle.getString("host");
    }
}
