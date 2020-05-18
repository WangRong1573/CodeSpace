package com.login.demo.model;

import com.login.demo.driver.Base;
import com.login.demo.utils.BaseInfo;
import com.login.demo.utils.ReadExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class Models extends Base {
    public Models() {
        String broName = BaseInfo.getInfo("broName");
        WebDriver driver = getDriver(broName);
        PageFactory.initElements(driver,this);
    }

    //By封装
    public By getBy(String locatorType,String value){
        By by;
        if (locatorType.equals("id")){
            by=By.id(value);
        }else if (locatorType.equals("name")){
            by=By.name(value);
        }else if (locatorType.equals("xpath")){
            by=By.xpath(value);
        }else if (locatorType.equals("linkText")){
            by=By.linkText(value);
        }else if (locatorType.equals("tagName")){
            by=By.tagName(value);
        }else if (locatorType.equals("cssSelector")){
            by=By.cssSelector(value);
        }else if (locatorType.equals("className")){
            by=By.className(value);
        }else {
            throw new RuntimeException("定位信息错误");
        }
        return by;
    }

    public WebElement findElement(String locatorType,String value){
        return driver.findElement(getBy(locatorType,value));
    }

    public WebElement findElement(String key){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String locatorType = elementData.get(key).split(",")[0];
        String value= elementData.get(key).split(",")[1];
        return findElement(locatorType,value);
    }


}
