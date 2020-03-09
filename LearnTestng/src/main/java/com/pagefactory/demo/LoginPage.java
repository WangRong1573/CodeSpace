package com.pagefactory.demo;

import org.testng.Assert;

/**
 * @author rong.wang
 * @date 21:47  2020/3/9
 * 操作层
 */
public class LoginPage {
    public void testLogin(String username,String password,String expected){
        Base base = new Base();
        base.open();
        base.pause(1);
        Page page = new Page();
        page.click();
        base.enterIframe();
        page.sendUsername(username);
        page.sendPassword(password);
        base.pause(2);
        page.clickUnLogin();
        base.pause(1);
        page.clickDoLogin();
        base.pause(1);
        String errorMsg = page.getErrorMsg();
        Assert.assertEquals(errorMsg,expected);
        base.pause(2);
        base.quit();

    }
}
