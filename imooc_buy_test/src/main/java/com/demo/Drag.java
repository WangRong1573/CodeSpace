package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/9
 **/

public class Drag {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);
    }

    @AfterClass
    public void afterClass(int i) throws InterruptedException {
        Thread.sleep(1000*i);
        driver.quit();
    }

    @Test
    public void testDrag(){
        WebElement a = driver.findElement(By.id("A"));
        WebElement element = driver.findElement(By.xpath("html/body/div[1]/ul[2]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(a).moveToElement(element).release(a).perform();
    }
}
