package com.pagefactory.demo.taobao;

import org.apache.log4j.Logger;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:操作层
 * @Author rong.wang
 * @Date 2020/3/12
 **/

public class Action {
    private Logger logger=Logger.getLogger(Action.class);
    public void actions(String key,String username,String password,String expected,String str,String str2){
        BasePage basePage = new BasePage();
        basePage.open();
        PageElement pageElement = new PageElement();
        pageElement.searchKey(key);
        logger.info("信息输入成功");
        pageElement.search();
        logger.info("点击搜索");
        basePage.pause(2);
        pageElement.clickTao();
        logger.info("点击淘宝网");
        basePage.creatNewWindow(str);
        basePage.pause(2);
        pageElement.login();
        logger.info("点击登录按钮");
        basePage.creatNewWindow(str2);
        pageElement.sendUserName(username);
        logger.info("用户名输入成功");
        pageElement.sendPassword(password);
        logger.info("密码输入成功");
        basePage.pause(2);
        pageElement.doLogin();
        logger.info("登录");
        basePage.pause(2);
        String errorMsg = pageElement.getErrorMsg();
        Assert.assertEquals(errorMsg,expected);
        basePage.pause(2);
        basePage.close();
        logger.info("窗口关闭成功");
    }
}
