package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 利用io流读取配置文件内容
 * @Author rong.wang
 * @Date 2020/8/6
 **/

public class IoProperties {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("config.properties");

        Properties pro = new Properties();

        pro.load(fis);

        System.out.println(pro.getProperty("username"));
    }
}
