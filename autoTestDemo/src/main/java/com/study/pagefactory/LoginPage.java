package com.study.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author rong.wang
 * @date 21:39  2020/2/24
 * 元素对象层
 */
public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BasePage.driver,this);
    }

    //关闭活动窗口按钮对象
    @FindBy(className = "redrain-closeBtn")
    @CacheLookup
    private WebElement closeBtn;

    //登录按钮对象
    @FindBy(id = "js-signin-btn")
    @CacheLookup
    private WebElement loginBtn;

    //用户名输入框对象
    @FindBy(name = "email")
    @CacheLookup
    private WebElement user_name;

    //密码输入框对象
    @FindBy(name = "password")
    @CacheLookup
    private WebElement pass_word;

    //登录框登录按钮对象
    @FindBy(className = "moco-btn-red")
    @CacheLookup
    private WebElement btn;

    @FindBy(css = "[data-error-hint='请输入正确的邮箱或手机号']")
    @CacheLookup
    private WebElement errMsg;

    public WebElement getErrMsg() {
        return errMsg;
    }

    public WebElement getCloseBtn() {
        return closeBtn;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getUser_name() {
        return user_name;
    }

    public WebElement getPass_word() {
        return pass_word;
    }

    public WebElement getBtn() {
        return btn;
    }


    public void close(){
        getCloseBtn().click();
    }

    public void login(){
        getLoginBtn().click();
    }

    public void sendUsername(String username){
        getUser_name().clear();
        getUser_name().sendKeys(username);
    }

    public void sendPassword(String password){
        getPass_word().clear();
        getPass_word().sendKeys(password);
    }

    public void login2(){
        getBtn().click();
    }

    public String getErrorMsg(){
         return getErrMsg().getText().trim();
    }
}
