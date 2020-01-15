package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:53  2020/1/15
 */
public class TestOpenJD {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testOpenJD(){
        driver.get("https://www.baidu.com/");
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.id("kw")).sendKeys("京东");
        driver.findElement(By.id("su")).click();
        pause(2);
        driver.findElement(By.linkText("京东JD.COM官网 多快好省 只为品质生活")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }

        Set<String> windowHandle1 = driver.getWindowHandles();
        System.out.println(windowHandle1.size());

        pause(2);
        driver.findElement(By.linkText("你好，请登录")).click();
        driver.findElement(By.linkText("账户登录")).click();
        driver.findElement(By.id("loginname")).sendKeys("username124545");
        driver.findElement(By.id("nloginpwd")).sendKeys("52754552");
        driver.findElement(By.linkText("登    录")).click();
    }

    @AfterClass
    public void afterClass(){
        pause(3);
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
