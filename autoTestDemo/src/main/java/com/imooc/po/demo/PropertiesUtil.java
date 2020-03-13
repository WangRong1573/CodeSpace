package com.imooc.po.demo;

import java.io.*;
import java.util.Properties;

/**
 * @author rong.wang
 * @date 11:33  2020/2/22
 */
public class PropertiesUtil {

    private Properties prop;
    private String filePath;

    /**
     * 构造方法
    **/
    public PropertiesUtil(String filePath){
        this.filePath=filePath;
        this.prop=readProperties();
    }

    //读取配置文件
    private Properties readProperties(){
        Properties properties=new Properties();
        InputStream ins= null;
        try {
            ins = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(ins,"GBK");
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getProp(String key){
        if (prop.containsKey(key)){
            return prop.getProperty(key);
        }else {
            System.out.println("key值定位信息错误");
            return "";
        }
    }
}
