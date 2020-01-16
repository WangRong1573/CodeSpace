package com.study.dingwei;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:20  2020/1/16
 * 删除按钮弹窗的确认和取消操作
 */
public class TestAlert2 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testAlert(){
        driver.get("https://www.baidu.com/");
        driver.navigate().to("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/alert.html");
        driver.findElement(By.id("dialog")).click();
        //切换到alert,获取alert对象
        Alert alert = driver.switchTo().alert();
        //获取alert文本
        System.out.println(alert.getText());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        //点击确定/接收
//        alert.accept();

        //取消
        alert.dismiss();
    }
    @AfterClass
    public void afterClass(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
