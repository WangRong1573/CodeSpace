package com.frame.demo.model;

import org.apache.log4j.Logger;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:控件的封装
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class Actions extends BasePage {
    private Logger logger=Logger.getLogger(Actions.class);
    public void enterFrame(){
        logger.info("进入iframe成功");
        driver.switchTo().frame(0);
    }

    public void click(String name){
        logger.info("点击"+name);
        getElement(name).click();
    }

    public void sendKeys(String name,String str){
        logger.info(name+"输入"+str+"成功");
        getElement(name).sendKeys(str);
    }

    public String getText(String name){
        logger.info("获取提示信息成功："+getElement(name).getText());
        return getElement(name).getText();
    }
}
