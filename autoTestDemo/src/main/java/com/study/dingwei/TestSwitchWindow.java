package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 21:12  2020/1/14
 * 窗口句柄练习，切换窗口
 */
public class TestSwitchWindow {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //@Test
    //以窗口句柄形式判断
    public void testWindowSwitch(){
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("淘宝网");
        driver.findElement(By.id("su")).click();
        //获取当前页面句柄
        String windowHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("淘宝网 - 淘!我喜欢")).click();
        //获取当前所有页面句柄的集合
        Set<String> windowHandles = driver.getWindowHandles();
        for (String we:windowHandles) {
            //如果当前页面与原页面句柄不同，则切换窗口到当前页面，并关闭原窗口
            if (!we.equals(windowHandle)){
                driver.switchTo().window(we);
                break;
            }else {
                driver.close();
            }
        }
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
