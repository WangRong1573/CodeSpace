package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/13
 **/

public class Test163Login {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @Test
    public void test163Login(){
        driver.findElement(By.name("wd")).sendKeys("163邮箱");
        driver.findElement(By.id("su")).click();
        driver.findElement(By.linkText("163网易免费邮--中文邮箱第一品牌_163邮箱")).click();
        String windowHandle = driver.getWindowHandle();
        for (String window:driver.getWindowHandles()) {
            if (window.equals(windowHandle)){
                continue;
            }else {
                driver.switchTo().window(window);
            }
        }
        pause(1);

        driver.findElement(By.linkText("密码登录")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("14142424");
        driver.findElement(By.name("password")).sendKeys("245454");
        driver.findElement(By.id("dologin")).click();
        String text = driver.findElement(By.cssSelector(".ferrorhead")).getText();
        Assert.assertEquals(text,"帐号或密码错误");
        pause(1);
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
