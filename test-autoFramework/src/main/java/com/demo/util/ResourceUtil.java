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
    //定义异常状态码
    public static int RESPONSE_STATUS_CODE_200 = 200;
    public static int RESPONSE_STATUS_CODE_201 = 201;
    public static int RESPONSE_STATUS_CODE_404 = 404;
    public static int RESPONSE_STATUS_CODE_500 = 500;

    public static String getHost(){
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        return bundle.getString("host");
    }
}
