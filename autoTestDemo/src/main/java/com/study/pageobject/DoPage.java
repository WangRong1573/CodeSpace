package com.study.pageobject;

/**
 * @author rong.wang
 * @date 19:40  2020/1/9
 * 逻辑操作层
 */
public class DoPage {
    public DoPage(String username,String password) {
        //打开页面，点击密码登录
        BasePage bp=new BasePage();
        bp.open();
        bp.btn_password();
        bp.pause(1);

        //输入用户名，密码，勾选十日免登录，点击登录
        ElementPage ep=new ElementPage();
        ep.sendUsername(username);
        ep.sendPassword(password);
        ep.click_radio();
        ep.doLogin();

        //关闭页面
        bp.pause(2);
        bp.close();
    }
}
