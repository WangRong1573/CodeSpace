package com.pagefactory.demo.taobao;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 元素对象管理层
 * @Author rong.wang
 * @Date 2020/3/12
 **/

public class PageElement {
    public PageElement() {
        PageFactory.initElements(BasePage.getDriver(),this);
    }

    @FindBy(name = "wd")
    @CacheLookup
    private WebElement inputForm;

    @FindBy(id = "su")
    @CacheLookup
    private WebElement searchBtn;

    @FindBy(linkText ="淘宝网 - 淘！我喜欢")
    @CacheLookup
    private WebElement taoLinkTest;

    @FindBy(linkText = "登录")
    @CacheLookup
    private WebElement loginBtn;

    @FindBy(css = "input#TPL_username_1")
    @CacheLookup
    private WebElement user_name;

    @FindBy(id = "TPL_password_1")
    @CacheLookup
    private WebElement pass_word;

    @FindBy(id = "J_SubmitStatic")
    @CacheLookup
    private WebElement doLogin;

    @FindBy(className = "error")
    @CacheLookup
    private WebElement error;

    public WebElement getError() {
        return error;
    }

    public WebElement getInputForm() {
        return inputForm;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getTaoLinkTest() {
        return taoLinkTest;
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


    public WebElement getDoLogin() {
        return doLogin;
    }


    //封装输入
    public void searchKey(String key){
        getInputForm().clear();
        getInputForm().sendKeys(key);
    }
    //输入搜索词
    public void search(){
        getSearchBtn().click();
    }
    //点击淘宝
    public void clickTao(){
        getTaoLinkTest().click();
    }
    //点击登录
    public void login(){
        getLoginBtn().click();
    }
    //输入用户名
    public void sendUserName(String username){
//        getUser_name().clear();
        getUser_name().sendKeys(username);
    }

    //输入密码
    public void sendPassword(String password){
//        getPass_word().clear();
        getPass_word().sendKeys(password);
    }

    //do login
    public void doLogin(){
        getDoLogin().click();
    }

    //获取错误信息
    public String getErrorMsg(){
        return getError().getText().trim();
    }

}
