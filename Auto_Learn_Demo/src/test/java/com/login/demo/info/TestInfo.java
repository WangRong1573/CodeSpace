package com.login.demo.info;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class TestInfo {

    @Test
    public void testInfo(){
        ResourceBundle config = ResourceBundle.getBundle("config", Locale.CHINA);
        String string = config.getString("broName");
        Assert.assertEquals(string,"chrome");
    }
}
