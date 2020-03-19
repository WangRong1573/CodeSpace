package com.demo.page;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/19
 **/

public class Actions extends Page{
    //进入iframe
    public void enterFrame(){
        driver.switchTo().frame(0);
    }

    //点击密码登录
    public void click(String name){
        findElement(name).click();
    }

    /**
     * 输入
     * @param name
     * @param str
     */
    public void sendKeys(String name,String str){
        findElement(name).sendKeys(str);
    }

    public String getText(String name){
       return findElement(name).getText();
    }
}
