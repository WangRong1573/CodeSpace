package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/7
 **/

public class TestHandle {
    /**
     * 多窗口句柄操作
     * 打开百度首页
     * 2.搜索框输入163
     * 3.点击搜索
     * 4.新窗口点击163邮箱
     */

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);
    }

    @Test
    public void testClick() throws InterruptedException {
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.id("kw")).sendKeys("163");
        pause(1);
        driver.findElement(By.id("su")).click();
        pause(1);
        driver.findElement(By.linkText("网易163")).click();
        pause(1);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        pause(2);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public void pause(int i) {
        try {
            Thread.sleep(1000 * i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
