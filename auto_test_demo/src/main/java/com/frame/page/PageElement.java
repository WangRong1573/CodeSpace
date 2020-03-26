package com.frame.page;

import com.frame.driver.GetDriver;
import com.frame.utils.BaseInfo;
import com.frame.utils.ProUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:页面元素封装By 和findElement
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class PageElement extends GetDriver {
    public PageElement() {
        String broName = BaseInfo.getInfo("broName");
        driver = getDriver(broName);
        PageFactory.initElements(driver,this);
    }

    //封装By
    public By getBy(String method ,String value){
        By by;
        if (method.equals("id")){
            by=By.id(value);
        }else if (method.equals("name")){
            by=By.name(value);
        }else if (method.equals("xpath")){
            by=By.xpath(value);
        }else if (method.equals("className")){
            by=By.className(value);
        }else if (method.equals("linkText")){
            by=By.linkText(value);
        }else if (method.equals("cssSelector")){
            by=By.cssSelector(value);
        }else if (method.equals("tagName")){
            by=By.tagName(value);
        }else {
            throw new RuntimeException("请检查定位信息");
        }
        return by;
    }

    //封装findElement
    public WebElement findElement(String method,String value){
        return driver.findElement(getBy(method,value));
    }

    //通过配置文件的key来获取method和value
    public WebElement findElement(String key){
        ProUtils proUtils = new ProUtils();
        String method = proUtils.getPro(key).split(">")[0];
        String value = proUtils.getPro(key).split(">")[1];
        return findElement(method,value);
    }

}
