package com.test.info;

import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:测试通过配置文件获取浏览器类型
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class TestInfo {
    @Test
    public void testInfo(){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        System.out.println(config.getString("broName"));
    }
}
