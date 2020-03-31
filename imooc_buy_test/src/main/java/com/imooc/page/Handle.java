package com.imooc.page;

import com.imooc.base.DriverBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:操作层，封装操作的方法
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class Handle extends PageElement {
    private Logger logger = Logger.getLogger(Handle.class);
    //点击
    public void click(String key) {
        logger.info("点击"+key);
        findElement(key).click();
    }

    //输入
    public void sendKeys(String key, String str) {
        logger.info(key+"输入"+str);
        findElement(key).sendKeys(str);
    }

    //获取文本
    public String getText(String key) {
        logger.info("获取"+key);
        return findElement(key).getText();
    }

    //鼠标移动
    public void moveToElement(String key) {
        logger.info("鼠标移动至"+key);
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(key)).perform();
    }
}
