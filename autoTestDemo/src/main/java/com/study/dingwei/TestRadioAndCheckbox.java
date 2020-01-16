package com.study.dingwei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author rong.wang
 * @date 20:43  2020/1/16
 * 单选框操作和复选框操作api
 */
public class TestRadioAndCheckbox {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testRadioAndCheckbox(){
        driver.get("file:///G:/%E8%87%AA%E5%8A%A8%E5%8C%96%E5%AD%A6%E4%B9%A0%E8%A7%86%E9%A2%91/%E5%85%AD%E5%93%A5%E4%BB%A3%E7%A0%81/%E5%AE%9E%E4%BE%8B%E7%BD%91%E9%A1%B5/CheckBoxAndRadioDemo.html");
        driver.findElement(By.xpath("html/body/div[1]/p/label[1]/input")).click();

        //全选
        List<WebElement> elements = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
        System.out.println(elements.size());
        for (WebElement e:elements) {
            e.click();
        }

        driver.findElement(By.cssSelector("[value=\"李白\"][type=\"radio\"]")).click();
        //模拟王者农药钻石排位场景：如果某英雄被选择了，则提示此英雄已被选择，请选择其他英雄，否则可以选择，以李白为例
        WebElement element = driver.findElement(By.cssSelector("[value=\"李白\"][type=\"radio\"]"));
        boolean selected = element.isSelected();
        if (selected){
            System.out.println("此英雄已被选择，请选择其他英雄");
        }else {
            driver.findElement(By.cssSelector("[value=\"李白\"][type=\"radio\"]")).click();
        }
    }
}
