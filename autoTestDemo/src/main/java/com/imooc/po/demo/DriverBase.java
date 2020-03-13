package com.imooc.po.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author rong.wang
 * @date 20:18  2020/2/26
 * 封装driver，并通过浏览器名称选择不同driver执行
 */
public class DriverBase {
    WebDriver driver;

    public DriverBase(String brower) {
        this.driver = driver;
    }

    public void close(){
        driver.quit();
    }

    /**
     * 基于webdriver封装element
     * @param by
     * @return
     */
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
}
