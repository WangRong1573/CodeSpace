package com.frame.utils;

import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:读取定位信息配置文件工具类
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class ProUtils {
    public String getPro(String key){
        Properties properties=new Properties();
        try {
            FileInputStream fis = new FileInputStream("ele.properties");
            BufferedInputStream bis = new BufferedInputStream(fis);
            properties.load(bis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String property = properties.getProperty(key);
        return property;
    }
}
