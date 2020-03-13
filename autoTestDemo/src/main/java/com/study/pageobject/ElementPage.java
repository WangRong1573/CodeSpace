package com.study.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author rong.wang
 * @date 19:32  2020/1/9
 * 元素对象层
 */
public class ElementPage {

    @FindBy(xpath = "placeholder=\"邮箱帐号或手机号码")
    @CacheLookup
    private WebElement user_name;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement pass_word;

    @FindBy(id = "un-login")
    @CacheLookup
    private WebElement radio_btn;

    @FindBy(id = "dologin")
    @CacheLookup
    private WebElement btn_login;

    public ElementPage() {
    }

    public ElementPage(WebElement user_name, WebElement pass_word, WebElement btn_login) {
        this.user_name = user_name;
        this.pass_word = pass_word;
        this.btn_login = btn_login;
    }

    public WebElement getUser_name() {
        return user_name;
    }

    public void setUser_name(WebElement user_name) {
        this.user_name = user_name;
    }

    public WebElement getPass_word() {
        return pass_word;
    }

    public void setPass_word(WebElement pass_word) {
        this.pass_word = pass_word;
    }

    public WebElement getBtn_login() {
        return btn_login;
    }

    public void setBtn_login(WebElement btn_login) {
        this.btn_login = btn_login;
    }

    public void sendUsername(String username){
        user_name.sendKeys(username);
    }

    public void sendPassword(String password){
        pass_word.sendKeys(password);
    }

    public void click_radio(){
        radio_btn.click();
    }

    public void doLogin(){
        btn_login.click();
    }
}
