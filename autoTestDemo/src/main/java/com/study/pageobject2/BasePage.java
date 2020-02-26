package com.study.pageobject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author rong.wang
 * @date 20:01  2020/2/26
 */
public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static By inputForm=By.name("wd");

    public static By searchButton=By.id("su");

    public void sendKeys(String text){
        driver.findElement(inputForm).clear();
        driver.findElement(inputForm).sendKeys(text);
    }

    public void search(){
        driver.findElement(searchButton).click();
    }

    public void close(){
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
