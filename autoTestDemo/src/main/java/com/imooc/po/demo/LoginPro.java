package com.imooc.po.demo;

/**
 * @author rong.wang
 * @date 21:17  2020/2/26
 */
public class LoginPro {
    LoginPageHandle lph;

    public LoginPro(DriverBase driver) {
        lph=new LoginPageHandle(driver);
    }

    public void login(String user,String password){
        if (lph.assertLoginPage()){
            lph.sendKeyUser(user);
            lph.sendKeyPassword(password);
            lph.clickAutoSignin();
            lph.clickLoginButton();
        }else {
            System.out.println("页面不存在或者状态不正确");
        }
    }
}
