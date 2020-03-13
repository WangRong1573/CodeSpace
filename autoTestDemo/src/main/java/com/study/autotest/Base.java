package com.study.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author rong.wang
 * @date 20:02  2020/2/24
 * page object 模式练习，练习页面慕课网登录页面
 * https://www.imooc.com/
 */
public class Base {

    WebDriver driver;

    public static By user_name=By.name("email");

    public static By pass_word=By.name("password");

    public static By errMsg=By.cssSelector("[data-error-hint='请输入正确的邮箱或手机号']");

    public static By loginBtn=By.xpath("//form[@id='signup-form']//input[@value='登录']");

    public static By closeBtn=By.className("redrain-closeBtn");

    public static By btnLogin=By.linkText("登录");

    /**
     * 初始化driver对象
     * @param driver
     */
    public Base(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * 关闭弹窗广告
     */
    public void closeWindow(){
        driver.findElement(closeBtn).click();
    }

    /**
     * 点击登录弹出登录框
     */
    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    /**
     * 输入用户名操作
     * @param username
     */
    public void sendUsername(String username){
        driver.findElement(user_name).clear();
        driver.findElement(user_name).sendKeys(username);
    }

    /**
     * 输入密码操作
     * @param password
     */
    public void sendPassword(String password){
        driver.findElement(pass_word).clear();
        driver.findElement(pass_word).sendKeys(password);
    }

    /**
     * 登录
     */
    public void login(){
        driver.findElement(loginBtn).click();
    }

    /**
     * 获取错误提示信息
     * @return
     */
    public String getErrMsg(){
        return driver.findElement(errMsg).getText().trim();
    }

}
