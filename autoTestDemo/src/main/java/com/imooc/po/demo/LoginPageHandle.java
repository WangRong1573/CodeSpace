package com.imooc.po.demo;

/**
 * @author rong.wang
 * @date 21:08  2020/2/26
 */
public class LoginPageHandle {
    DriverBase driver;
    LoginPage lp;

    public LoginPageHandle(DriverBase driver) {
        this.driver = driver;
        lp=new LoginPage(driver);
    }

    public void sendKeyUser(String username){
        lp.sendKeys(lp.getUserElement(),username);
    }

    public void sendKeyPassword(String password){
        lp.sendKeys(lp.getPasswordElement(),password);
    }

    public void clickLoginButton(){
        lp.click(lp.getLoginButtonElement());
    }

    public void clickAutoSignin(){
        lp.click(lp.getAutoSigninElement());
    }

    /**
     * 判断是否是登录页面
     */
    public boolean assertLoginPage(){
        return lp.isDisplay(lp.getUserElement());
    }
}
