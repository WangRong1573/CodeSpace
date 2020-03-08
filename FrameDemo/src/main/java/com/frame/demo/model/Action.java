package com.frame.demo.model;

import org.apache.log4j.Logger;

/**
 * @author rong.wang
 * @date 18:27  2020/3/8
 *
 */
public class Action extends BasePage{

    private Logger logger=Logger.getLogger(Action.class);

    public void enterFrame(){
        logger.info("进入iframe success");
        driver.switchTo().frame(0);
    }

    public void click(String name){
        logger.info("点击"+name);
        getElement(name).click();
    }

    public void sendKeys(String name,String str){
        logger.info(name+str);
        getElement(name).clear();
        getElement(name).sendKeys(str);
    }

    public String getErrorMsg(String name){
        logger.info("获取文本成功");
        return getElement(name).getText();
    }
}
