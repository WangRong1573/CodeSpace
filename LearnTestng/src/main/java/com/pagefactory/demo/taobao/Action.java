package com.pagefactory.demo.taobao;

import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:操作层
 * @Author rong.wang
 * @Date 2020/3/12
 **/

public class Action {
    public void actions(String key,String username,String password,String expected,String str,String str2){
        BasePage basePage = new BasePage();
        basePage.open();
        PageElement pageElement = new PageElement();
        pageElement.searchKey(key);
        pageElement.search();
        basePage.pause(2);
        pageElement.clickTao();
        basePage.creatNewWindow(str);
        basePage.pause(2);
        pageElement.login();
        basePage.creatNewWindow(str2);
        pageElement.sendUserName(username);
        pageElement.sendPassword(password);
        basePage.pause(2);
        pageElement.doLogin();
        basePage.pause(2);
        String errorMsg = pageElement.getErrorMsg();
        Assert.assertEquals(errorMsg,expected);
        basePage.pause(2);
        basePage.close();
    }
}
