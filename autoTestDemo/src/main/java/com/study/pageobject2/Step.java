package com.study.pageobject2;

import org.openqa.selenium.WebDriver;

/**
 * @author rong.wang
 * @date 20:06  2020/2/26
 */
public class Step {
    WebDriver driver;

    public Step(WebDriver driver) {
        this.driver = driver;
    }

    public void searchText(String text){
        BasePage basePage = new BasePage(driver);
        basePage.sendKeys(text);
        basePage.pause(2);
        basePage.search();
        basePage.pause(1);
        basePage.close();
    }
}
