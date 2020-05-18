package com.autotest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/5/8
 **/

public class OpenBaidu {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.findElement(By.id("kw")).sendKeys("selenium");
        pause(2);
        driver.findElement(By.id("su")).click();
        pause(1);
    }

    @AfterTest
    public void afterTest(){
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
