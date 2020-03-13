package com.imooc.po.demo;

import org.openqa.selenium.By;

/**
 * @author rong.wang
 * @date 20:54  2020/2/26
 */
public class GetByLocator {
    public static By getByLocator(String key){
        PropertiesUtil propertiesUtil = new PropertiesUtil("element.properties");
        String locator=propertiesUtil.getProp(key);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else {
            return By.xpath(locatorValue);
        }
    }
}
