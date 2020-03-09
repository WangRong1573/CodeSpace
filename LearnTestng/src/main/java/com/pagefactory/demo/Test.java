package com.pagefactory.demo;

/**
 * @author rong.wang
 * @date 21:51  2020/3/9
 */
public class Test {
    @org.testng.annotations.Test
    public void test(){
        LoginPage loginPage = new LoginPage();
        loginPage.testLogin("xiaoming","123456","该帐号已被锁定，请前往帐号修复中心进行解锁");
    }
}
