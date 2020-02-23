package com.imooc.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 11:28  2020/2/22
 * 自动截图
 */
public class LoginDemo6 {
    public WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("js-signin-btn"));
        username.click();
    }
    @Test
    public void login(){
        String username="18272691567";
        String userpass="yucheng2017";
//        String passElement="password";
//        String passBy="name";
//        String buttonElement=".moco-btn-red";
//        String buttonBy="cssSelector";
//        String headerElement="header-avator";
//        String headerBy="id";
//        String nameElement="name";
//        String nameBy="className";

        WebElement userName = this.element(this.byStr("username"));
        userName.isDisplayed();
        pause(2);
        userName.sendKeys(username);
        WebElement password = this.element(this.byStr("userpass"));
        password.isDisplayed();
        pause(2);
        password.sendKeys(userpass);
        WebElement btn = this.element(this.byStr("loginButton"));
        btn.isDisplayed();
        btn.click();
        pause(2);
        //验证是否登录成功
        WebElement header = this.element(this.byStr("header"));
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        pause(2);
        WebElement name = this.element(this.byStr("name"));
        System.out.println(name.getText());
        if (name.getText().equals("慕仰2316096")){
            this.takeScreenShot();            System.out.println("登录成功");
        }else {
            System.out.println("登录信息错误");
        }
    }

    public By byStr(String key){
        PropertiesUtil propertiesUtil=new PropertiesUtil("G:\\CodeSpace\\autoTestDemo\\element.properties");
        String locator = propertiesUtil.getProp(key);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else {
            return By.cssSelector(locatorValue);
        }
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement element(By by){
        WebElement ele=driver.findElement(by);
        return ele;
    }

    /**
     * 截图，以时间戳命名
     */
    public void takeScreenShot(){
        //获取当前时间的时间戳
        long date = System.currentTimeMillis();
        //当前路径
        String userPath = System.getProperty("user.dir");
        //以时间戳命名
        String path = String.valueOf(date);
        path=path+".png";
        //截图路径
        String screenPath=userPath+"/"+path;
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        pause(2);
        driver.quit();
    }
}
