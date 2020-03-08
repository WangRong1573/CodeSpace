package com.frame.demo.utils;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author rong.wang
 * @date 17:49  2020/3/8
 */
public class BaseInfo {
    public static String getInfo(String key){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String value = config.getString(key);
        return  value;
    }

}
