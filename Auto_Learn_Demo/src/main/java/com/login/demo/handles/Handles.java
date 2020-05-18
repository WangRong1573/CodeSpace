package com.login.demo.handles;

import com.login.demo.driver.Base;
import com.login.demo.model.Models;
import org.apache.log4j.Logger;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class Handles extends Models {

    private Logger logger=Logger.getLogger(Handles.class);

    public void sendKeys(String key,String str){
        findElement(key).sendKeys(str);
        logger.info("输入"+key);
    }

    public void click(String key){
        findElement(key).click();
        logger.info("点击"+key);
    }

    public void enterFrame(){
        driver.switchTo().frame(0);
        logger.info("进入iframe");
    }

    public void enterFrame(String key){
        driver.switchTo().frame(key);
    }

    public String getText(String key){
        logger.info("获取"+key+"文本");
       return findElement(key).getText();
    }
}
