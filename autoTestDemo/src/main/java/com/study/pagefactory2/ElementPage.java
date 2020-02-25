package com.study.pagefactory2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author rong.wang
 * @date 21:10  2020/2/25
 */
public class ElementPage {
    public ElementPage() {
        PageFactory.initElements(BasePage.driver,this);
    }

    @FindBy(linkText = "密码登录")
    @CacheLookup
    private WebElement loginBtn;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement userName;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement passWord;

    @FindBy(id = "dologin")
    @CacheLookup
    private WebElement doLogin;

    @FindBy(className = "ferrorhead")
    @CacheLookup
    private WebElement errMsg;

    public WebElement getErrMsg() {
        return errMsg;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return passWord;
    }

    public WebElement getDoLogin() {
        return doLogin;
    }

    public void goLoginForm(){
        getLoginBtn().click();
    }

    public void sendUsername(String username){
        getUserName().clear();
        getUserName().sendKeys(username);
    }

    public void sendPassword(String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

    public void login(){
        getDoLogin().click();
    }

    public String getErrorMsg(){
        return getErrMsg().getText().trim();
    }
}
