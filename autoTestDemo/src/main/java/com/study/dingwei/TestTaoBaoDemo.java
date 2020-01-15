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
 * @date 20:11  2020/1/15
 * 百度首页搜索淘宝网，点击进入淘宝网页面，点击登录，点击密码登录，输入用户名和密码，点击登录按钮操作
 * 1.实现窗口切换并关闭原窗口
 * 2.api练习
 */
public class TestTaoBaoDemo {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testOpenTaoBao(){
        driver.get("https://www.baidu.com/");
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.id("kw")).sendKeys("淘宝网");
        driver.findElement(By.id("su")).click();
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

        String oldwindowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("登录")).click();
        Set<String> newwindowHandles = driver.getWindowHandles();
        for (String win:newwindowHandles) {
            if (!oldwindowHandle.equals(win)){
                driver.switchTo().window(win);
                break;
            }else {
                driver.close();
            }
        }
        driver.findElement(By.linkText("密码登录")).click();
        driver.findElement(By.id("TPL_username_1")).sendKeys("xiaoming");
        driver.findElement(By.id("TPL_password_1")).sendKeys("124554");
        driver.findElement(By.id("J_SubmitStatic")).click();
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
