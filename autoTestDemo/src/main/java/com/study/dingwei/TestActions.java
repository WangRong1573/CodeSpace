package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 22:25  2020/1/8
 * 鼠标事件  tip：需要添加perform（）
 */
public class TestActions {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/MouseDemo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testActions(){
        WebElement mouse2 = driver.findElement(By.id("mouse2"));
        Actions actions = new Actions(driver);
//        //鼠标单击操作
//        actions.click(mouse2).perform();

//        //双击操作
//        WebElement mouse3 = driver.findElement(By.id("mouse3"));
//        actions.doubleClick(mouse3).perform();

//        //鼠标右击
//        WebElement mouse5 = driver.findElement(By.id("mouse5"));
//        actions.contextClick(mouse5).perform();

//        //鼠标移动到元素
//        WebElement mouse4 = driver.findElement(By.id("mouse4"));
//        actions.moveToElement(mouse4).perform();

//        //鼠标按下和抬起
//        WebElement mouse = driver.findElement(By.id("mouse"));
//        actions.clickAndHold(mouse).perform();
//        actions.release(mouse).perform();

//        //鼠标的悬浮和离开
//        WebElement mouse1 = driver.findElement(By.id("mouse1"));
//        WebElement mouse3 = driver.findElement(By.id("mouse3"));
//        actions.moveToElement(mouse1).perform();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        actions.moveToElement(mouse3).perform();

        //鼠标的悬浮和离开实现方式2(这种方法只是释放了点击操作，并没有离开元素，实现方式有误)
        WebElement mouse1 = driver.findElement(By.id("mouse1"));
        actions.clickAndHold(mouse1).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.release(mouse1).perform();
    }
}
