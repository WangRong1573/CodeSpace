package com.imooc.business;

import com.imooc.page.Handle;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:业务层
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class Operate extends Handle {

    //登录
    public void login(String username,String password,String excepted){
        open();
        click("登录");
        sendKeys("用户名",username);
        sendKeys("密码",password);
        click("弹框登录");
        moveToElement("头像");
        String userText = getText("用户信息");
        Assert.assertEquals(userText,excepted);
    }

    //选择商品，点击立即购买，点击提交订单到支付中心
    public void buy(){
        driver.get("https://class.imooc.com/sale/webfullstack");
        String detailPrice = getText("详情页价格");
        click("立即购买");

        String sureOrderPrice = getText("确认订单页价格");
        Assert.assertEquals(detailPrice,sureOrderPrice);
        pause(2);
        quit();
    }

    //商品添加购物车
    public void addShoppingCar(){
        driver.get("https://coding.imooc.com/class/432.html");
        String shoppingCarText = getText("课程信息--购物车case");
        click("加购物车");
        moveToElement("购物车img");
        String iconText = getText("数量icon");
        String inCarText = getText("购物车内课程信息");
        Assert.assertEquals(shoppingCarText,inCarText);
    }
}
