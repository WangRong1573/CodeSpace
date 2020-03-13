package com.study.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:52  2020/2/23
 * Ajax操作api
 */
public class TestAjax {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.hao123.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAjax(){
        driver.findElement(By.name("word")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("[data-query] b"));
        for (WebElement element:elements){
            System.out.println(element.getText());
            if (element.getText().equals("港铁员工遭欺凌")){
                element.click();
            }
        }
    }

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
