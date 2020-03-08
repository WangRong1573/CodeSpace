package com.frame.demo.model;

import com.frame.demo.base.GetDriver;
import com.frame.demo.utils.BaseInfo;
import com.frame.demo.utils.ReadExcelUtil;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

/**
 * @author rong.wang
 * @date 17:57  2020/3/8
 * 元素对象管理
 */
public class BasePage extends GetDriver {

    public BasePage() {
        String browerName = BaseInfo.getInfo("browerName");
        driver=getDriver(browerName);
        PageFactory.initElements(driver,this);
    }

    public By getBy(String method, String methodValue){
        By by;
        if (method.equalsIgnoreCase("id")){
            by=By.id(methodValue);
        }else if (method.equalsIgnoreCase("name")){
            by=By.name(methodValue);
        }else if (method.equalsIgnoreCase("linkText")){
            by=By.linkText(methodValue);
        }else if (method.equalsIgnoreCase("xpath")){
            by=By.xpath(methodValue);
        }else if (method.equalsIgnoreCase("className")){
            by=By.className(methodValue);
        }else if (method.equalsIgnoreCase("cssSelector")){
            by=By.cssSelector(methodValue);
        }else {
            throw new RuntimeException("元素定位信息错误");
        }
        return  by;
    }

    public WebElement getElement(String method,String methodValue){
        WebElement element = driver.findElement(getBy(method,methodValue));
        return element;
    }

    public WebElement getElement(String name){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String method = elementData.get(name).toString().split(",")[0];
        String methodValue = elementData.get(name).toString().split(",")[1];
        return getElement(method,methodValue);
    }
}
