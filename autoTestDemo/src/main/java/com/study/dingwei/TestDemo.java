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
 * @date 19:53  2020/2/17
 */
public class TestDemo {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }


    @Test
    public void testDemo() throws InterruptedException {
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("淘宝");
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("淘宝网 - 淘!我喜欢")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window:windowHandles) {
            if (!windowHandle.equals(window)){
                driver.switchTo().window(window);
                break;
            }else {
                driver.close();
            }
        }
        String windowHandle1 = driver.getWindowHandle();
        driver.findElement(By.linkText("登录")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        for (String newWindow:windowHandles1) {
            if (!windowHandle1.equals(newWindow)){
                driver.switchTo().window(newWindow);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.linkText("密码登录")).click();
        driver.findElement(By.name("TPL_username")).sendKeys("123345");
        driver.findElement(By.name("TPL_password")).sendKeys("3654485");
        driver.findElement(By.className("J_Submit")).click();
    }

    @AfterClass
    public void afterClass(){
        try {
            Thread.sleep(3000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
