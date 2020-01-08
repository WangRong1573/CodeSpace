package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:33  2020/1/8
 */
public class TestSendkey {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/FormButton.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSendkey(){
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("rongwang");
        pause(2);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("122345");
        pause(2);
        driver.findElement(By.id("login")).click();
    }

    @AfterTest
    public void afterTest(){
        pause(2);
        driver.quit();
    }

    public void pause(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
