package com.imooc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 19:34  2020/2/21
 * 登录脚本的重构及By封装
 */
public class LoginDemo2 {
    public WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("js-signin-btn"));
        username.click();
    }
    @Test
    public void login(){
        String username="18272691567";
        String usernameElement="email";
        String userBy="name";
        String userpass="yucheng2017";
        String passElement="password";
        String passBy="name";
        String buttonElement="input[value='登录']";
        String buttonBy="cssSelector";
        String headerElement="header-avator";
        String headerBy="id";
        String nameElement="name";
        String nameBy="className";
        WebElement userName = driver.findElement(this.byStr(userBy,usernameElement));
        userName.isDisplayed();
        pause(2);
        userName.sendKeys(username);
        WebElement password = driver.findElement(this.byStr(passBy,passElement));
        password.isDisplayed();
        pause(2);
        password.sendKeys(userpass);
        WebElement btn = driver.findElement(this.byStr(buttonBy,buttonElement));
        btn.isDisplayed();
        btn.click();
        pause(2);
        //验证是否登录成功
        WebElement header = driver.findElement(this.byStr(headerBy,headerElement));
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        pause(2);
        WebElement name = driver.findElement(this.byStr(nameBy,nameElement));
        System.out.println(name.getText());
        if (name.getText().equals("慕仰2316096")){
            System.out.println("登录成功");
        }else {
            System.out.println("登录信息错误");
        }
    }

    public By byStr(String by,String local){
        if (by.equals("id")){
            return By.id(local);
        }else if (by.equals("name")){
            return By.name(local);
        }else if (by.equals("className")){
            return By.className(local);
        }else {
            return By.cssSelector(local);
        }
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        pause(2);
        driver.quit();
    }
}
