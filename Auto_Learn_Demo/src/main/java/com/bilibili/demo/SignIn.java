package com.bilibili.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class SignIn {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://mail.163.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterTest(){
        pause(1);
        driver.quit();
    }

    public void pause(int i){
        try {
            Thread.sleep(1000*i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSignIn(){
        driver.findElement(By.linkText("注册新帐号")).click();
        //判断窗口句柄
        String windowHandle = driver.getWindowHandle();
        for (String window:driver.getWindowHandles()) {
            //如果当前窗口句柄不等于原窗口句柄，则切换到新窗口并关闭原窗口
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.id("username")).sendKeys("ethnic1573");
        driver.findElement(By.id("password")).sendKeys("yucheng2017");
        pause(1);
        driver.findElement(By.id("phone")).sendKeys("18272691567");
        pause(3);
        driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[4]/span")).click();
        pause(1);
        driver.findElement(By.linkText("立即注册")).click();

        String signInNow = driver.findElement(By.linkText("立即注册")).getText();
        Assert.assertEquals(signInNow,"立即注册");

    }
}
