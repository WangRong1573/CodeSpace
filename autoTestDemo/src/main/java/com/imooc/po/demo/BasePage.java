package com.imooc.po.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author rong.wang
 * @date 20:21  2020/2/26
 */
public class BasePage {
    DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }

    /**
     * 定位element
     * @param by
     * @return
     */
    public WebElement element(By by){
        WebElement element=driver.findElement(by);
        return  element;
    }

    /**
     * 封装输入
     * @param element
     * @param value
     */
    public void sendKeys(WebElement element,String value){
        if (element!=null){
            element.sendKeys(value);
        }else {
            System.out.println("元素没有定位到，输入失败");
        }
    }

    /**
     * 封装点击
     * @param element
     */
    public void click(WebElement element){
        if (element!=null){
            element.click();
        }else {
            System.out.println("元素没有定位到，点击失败");
        }
    }

    /**
     * 判断元素是否显示
     * @param element
     * @return
     */
    public boolean isDisplay(WebElement element){
        return element.isDisplayed();
    }

}
