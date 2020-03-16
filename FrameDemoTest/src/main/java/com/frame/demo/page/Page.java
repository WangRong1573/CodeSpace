package com.frame.demo.page;

import com.frame.demo.model.Actions;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:用于编写用例（操作层）
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class Page extends Actions {
    public void login(String username,String password,String except){
        open();
        click("密码登录");
        enterFrame();
        sendKeys("输入用户名",username);
        sendKeys("输入密码",password);
        click("点击登录");
        String text = getText("错误提示信息");
        Assert.assertEquals(text,except);
        close();
    }
}
