package com.frame.demo.loginpage;

import com.frame.demo.model.Action;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author rong.wang
 * @date 18:32  2020/3/8
 * 用于执行测试用例
 */
public class LoginPage  extends Action {
    public void login(String userName,String password,String expected){
        open();
        click("密码登录");
        enterFrame();
        sendKeys("输入用户名",userName);
        sendKeys("输入密码",password);
        click("点击登录");
        String errorMsg = getErrorMsg("错误提示信息");
        Assert.assertEquals(errorMsg,expected);
        close();
    }
}
