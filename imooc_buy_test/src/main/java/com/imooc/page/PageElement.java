package com.imooc.page;

import com.imooc.base.DriverBase;
import com.imooc.utils.BaseInfo;
import com.imooc.utils.ReadExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:元素层，封装元素定位方式和方法
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class PageElement extends DriverBase {
    public PageElement() {
        String broName = BaseInfo.getInfo("broName");
        WebDriver driver = getDriver(broName);
        PageFactory.initElements(driver, this);
    }

    /**
     * 封装By，通过元素定位method和value获取by对象
     *
     * @param method
     * @param value
     * @return
     */
    public By getBy(String method, String value) {
        By by;
        if (method.equals("id")) {
            by = By.id(value);
        } else if (method.equals("name")) {
            by = By.name(value);
        } else if (method.equals("className")) {
            by = By.className(value);
        } else if (method.equals("cssSelector")) {
            by = By.cssSelector(value);
        } else if (method.equals("xpath")) {
            by = By.xpath(value);
        } else if (method.equals("linkText")) {
            by = By.linkText(value);
        } else if (method.equals("tagName")) {
            by = By.tagName(value);
        } else {
            throw new RuntimeException("定位信息错误");
        }
        return by;
    }

    /**
     * 封装元素定位方法
     *
     * @param method
     * @param value
     * @return
     */
    public WebElement findElement(String method, String value) {
        return driver.findElement(getBy(method, value));
    }

    /**
     * 通过读取excel，传入key获取对应的定位method和定位value
     *
     * @param key
     * @return
     */
    public WebElement findElement(String key) {
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String method = elementData.get(key).toString().split(",")[0];
        String value = elementData.get(key).toString().split(",")[1];
        return findElement(method, value);
    }
}
