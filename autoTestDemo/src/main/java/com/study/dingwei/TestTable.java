package com.study.dingwei;

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
 * @date 21:11  2020/1/8
 * 获取表格元素对象及操作
 */
public class TestTable {
    WebDriver driver;
    //定义一个元素
    String str="第三行第五列";

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("file:///C:/Users/Administrator/Desktop/Table.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTable(){
        //通过标签名拿到table对象
        WebElement table = driver.findElement(By.tagName("table"));
        //通过表格对象获取行对象的集合
        List<WebElement> trs = table.findElements(By.tagName("tr"));
        for (WebElement tr:trs) {
            //通过行对象拿到单元格对象的集合
            List<WebElement> tds = tr.findElements(By.tagName("td"));
            //foreach循环遍历单元格对象的元素
            for (WebElement td:tds) {
                //每个单元格的内容
                String text = td.getText();
                if (text.equals(str)){
                    System.out.println(text);
                }else {
                    System.out.println();
                }
            }
        }
    }

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

