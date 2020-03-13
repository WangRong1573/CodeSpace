package com.imooc.po.demo;

/**
 * @author rong.wang
 * @date 21:25  2020/2/26
 */
public class Login extends CaseB{
    public DriverBase driver;
    LoginPro loginPro;
    public Login() {
        this.driver=initDriver("chrome");
        loginPro=new LoginPro(driver);
    }

    public void getLogin(){
    }
    public void testLogin(){
        loginPro.login("18272691567","yucheng2017");
    }
}
