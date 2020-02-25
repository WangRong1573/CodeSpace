package com.study.pagefactory;

import org.testng.Assert;

/**
 * @author rong.wang
 * @date 21:52  2020/2/24
 * 操作层
 */
public class LoginStep {
    public void step(String username,String password,String expected){
        BasePage basePage=new BasePage();
        basePage.open();
        LoginPage loginPage=basePage.loginPage();
        loginPage.close();
        loginPage.login();
        loginPage.sendUsername(username);
        loginPage.sendPassword(password);
        loginPage.login2();

        String errorMsg = loginPage.getErrorMsg();
        Assert.assertEquals(errorMsg,expected);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.close();
    }
}
