package com.study.autotest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * @author rong.wang
 * @date 20:19  2020/2/24
 * 操作层，执行对应的流程操作
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * 验证登录
     * @param username
     * @param password
     * @param except
     */
    public void loginStep(String username,String password,String except){
        Base base = new Base(driver);
        base.closeWindow();
        base.clickLogin();
        base.sendUsername(username);
        base.sendPassword(password);
        base.login();
        String msg = base.getErrMsg();
        Assert.assertEquals(msg,except);
    }
}
