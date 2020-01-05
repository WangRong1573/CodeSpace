package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

/**
 * @author rong.wang
 * @date 21:47  2020/1/5
 */
public class TestStartIe {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
        driver=new InternetExplorerDriver();
    }

    @Test
    public void testStartIe(){
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("kw")).sendKeys("selenium学习");
        driver.findElement(By.id("su")).click();
        sleep(3);
    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }

    public void sleep(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
