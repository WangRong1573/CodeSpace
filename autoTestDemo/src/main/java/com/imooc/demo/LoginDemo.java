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
 * @date 18:22  2020/2/21
 * 1.练习自动化测试用例编写
 * 2.模拟慕课网定位元素并实现登录，以及登录验证
 * 3.此案例运行成功需要输入正确的用户名密码
 */
public class LoginDemo {
    public WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void Login(){
        WebElement loginBtn = driver.findElement(By.id("js-signin-btn"));
        loginBtn.isDisplayed();
        loginBtn.click();
        WebElement userName = driver.findElement(By.name("email"));
        userName.isDisplayed();
        pause(2);
        userName.sendKeys("1827269xxxx");
        WebElement password = driver.findElement(By.name("password"));
        password.isDisplayed();
        pause(2);
        password.sendKeys("xxxxxxxx");
        WebElement btn = driver.findElement(By.cssSelector("input[value='登录']"));
        btn.isDisplayed();
        btn.click();
        pause(2);
        //验证是否登录成功
        WebElement header = driver.findElement(By.id("header-avator"));
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        pause(2);
        WebElement name = driver.findElement(By.className("name"));
        System.out.println(name.getText());
        if (name.getText().equals("慕仰2316096")){
            System.out.println("登录成功");
        }else {
            System.out.println("登录信息错误");
        }
    }
    @AfterTest
    public void afterTest(){
        pause(2);
        driver.quit();
    }
    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
