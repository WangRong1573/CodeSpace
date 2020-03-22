package com.demo.login;

import java.io.*;
import java.util.Properties;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/22
 **/

public class ProUtil {
    private String filePath;

    public ProUtil(String filePath) {
        this.filePath = filePath;
    }

    //通过key获取
    public String getPro(String key){
        Properties properties = new Properties();
        //读取文件
        InputStream in= null;
        try {
            in = new BufferedInputStream(new FileInputStream(filePath));
            //加载文件
            properties.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
