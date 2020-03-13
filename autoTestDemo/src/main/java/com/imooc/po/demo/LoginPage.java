package com.imooc.po.demo;

import org.openqa.selenium.WebElement;

/**
 * @author rong.wang
 * @date 20:47  2020/2/26
 */
public class LoginPage extends BasePage {
    public LoginPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取用户名输入框element
     * @return
     */
    public WebElement getUserElement(){
        WebElement username = element(GetByLocator.getByLocator("username"));
        return username;
    }

    /**
     * 获取密码输入框element
     * @return
     */
    public WebElement getPasswordElement(){
        WebElement userpass = element(GetByLocator.getByLocator("userpass"));
        return userpass;
    }

    /**
     * 获取登录按钮element
     * @return
     */
    public WebElement getLoginButtonElement(){
        return element(GetByLocator.getByLocator("loginButton"));
    }

    public WebElement getAutoSigninElement(){
        return element(GetByLocator.getByLocator("autoSigin"));
    }
}
