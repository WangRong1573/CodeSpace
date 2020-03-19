package com.demo.page;

import com.demo.base.GetDriver;
import com.demo.utils.BaseInfo;
import com.demo.utils.ReadExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:对象层
 * @Author rong.wang
 * @Date 2020/3/18
 **/

public class Page extends GetDriver {
    public Page() {
        String broName = BaseInfo.getInfo("broName");
        driver=getDriver(broName);
        PageFactory.initElements(driver,this);
    }

    //封装元素定位
    public By getBy(String method,String methodValue){
        By by;
        if (method.equals("id")){
            by=By.id(methodValue);
        }else if (method.equals("name")){
            by=By.name(methodValue);
        }else if (method.equals("xpath")){
            by=By.xpath(methodValue);
        }else if (method.equals("className")){
            by=By.className(methodValue);
        }else if (method.equals("cssSelector")){
            by=By.cssSelector(methodValue);
        }else if (method.equals("tagName")){
            by=By.tagName(methodValue);
        }else if (method.equals("linkText")){
            by=By.linkText(methodValue);
        }else {
            throw  new RuntimeException("定位信息错误");
        }
        return by;
    }

    public WebElement findElement(String method, String methodValue){
        WebElement element = driver.findElement(getBy(method,methodValue));
        return element;
    }

    public WebElement findElement(String key){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String method = elementData.get(key).toString().split(",")[0];
        String methodValue = elementData.get(key).toString().split(",")[1];
        return findElement(method,methodValue);
    }

//    @Test
//    public void test(){
//        Map<String, String> elementData = ReadExcelUtil.getElementData();
//        System.out.println(elementData);
//    }
}
