package com.frame.page;

import org.apache.log4j.Logger;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:操作层，封装操作行为
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class UserActions  extends PageElement{
    private Logger logger=Logger.getLogger(UserActions.class);
    //输入
    public void sendKey(String key,String str){
        logger.info("输入"+key);
        findElement(key).sendKeys(str);
    }
    //点击
    public void click(String key){
        logger.info("点击"+key);
        findElement(key).click();
    }

    //获取错误信息
    public String getError(String key){
        logger.info("获取错误提示信息:"+findElement(key).getText());
       return findElement(key).getText();
    }
}
