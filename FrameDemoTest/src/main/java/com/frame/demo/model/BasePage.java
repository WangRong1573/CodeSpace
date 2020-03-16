package com.frame.demo.model;

import com.frame.demo.base.GetDriver;
import com.frame.demo.utils.BaseInfo;
import com.frame.demo.utils.ReadExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:元素对象管理
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class BasePage extends GetDriver {

    public BasePage() {
        String browerName = BaseInfo.getBaseInfo("browerName");
        driver=getDriver(browerName);
        PageFactory.initElements(driver,this);
    }

    public By getBy(String method, String methodValue){
        By by;
        if (method.equals("id")){
            by=By.id(methodValue);
        }else if (method.equals("name")){
            by=By.name(methodValue);
        }else if (method.equals("linkText")){
            by=By.linkText(methodValue);
        }else if (method.equals("xpath")){
            by=By.xpath(methodValue);
        }else if (method.equals("className")){
            by=By.className(methodValue);
        }else if (method.equals("cssSelector")){
            by=By.cssSelector(methodValue);
        }else {
            throw new RuntimeException("请检查定位方式！");
        }
        return by;
    }

    public WebElement getElement(String method, String methodValue){
        WebElement element = driver.findElement(getBy(method,methodValue));
        return element;
    }

//    @Test
//    public void test(){
//        Map<String, String> elementData = ReadExcelUtil.getElementData();
//        System.out.println(elementData);
//    }

    public WebElement getElement(String name){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String method = elementData.get(name).toString().split(",")[0];
        String methodValue = elementData.get(name).toString().split(",")[1];
        return getElement(method,methodValue);
    }
}
