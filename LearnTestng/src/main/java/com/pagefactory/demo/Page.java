package com.pagefactory.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author rong.wang
 * @date 21:37  2020/3/9
 * 元素对象管层
 */
public class Page {
    public Page() {
        PageFactory.initElements(Base.getDriver(),this);
    }

    @FindBy(linkText = "密码登录")
    @CacheLookup
    private WebElement loginBtn;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement user_name;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement pass_word;

    @FindBy(css = "div#nerror > .ferrorhead2")
    @CacheLookup
    private WebElement errMsg;

    @FindBy(id = "un-login")
    @CacheLookup
    private WebElement unLogin;

    @FindBy(id = "dologin")
    @CacheLookup
    private WebElement doLogin;

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getUser_name() {
        return user_name;
    }

    public WebElement getPass_word() {
        return pass_word;
    }

    public WebElement getErrMsg() {
        return errMsg;
    }

    public WebElement getUnLogin() {
        return unLogin;
    }

    public WebElement getDoLogin() {
        return doLogin;
    }

    public void sendUsername(String username){
        getUser_name().clear();
        getUser_name().sendKeys(username);
    }

    public void sendPassword(String password){
        getPass_word().clear();
        getPass_word().sendKeys(password);
    }

    public void click(){
        getLoginBtn().click();
    }

    public void clickUnLogin(){
        getUnLogin().click();
    }

    public void clickDoLogin(){
        getDoLogin().click();
    }

    public String getErrorMsg(){
        return getErrMsg().getText().trim();
    }
}
