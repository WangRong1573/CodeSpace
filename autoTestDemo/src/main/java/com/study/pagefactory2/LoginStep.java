package com.study.pagefactory2;

import org.testng.Assert;

/**操作层
 * @author rong.wang
 * @date 21:34  2020/2/25
 */
public class LoginStep {
    public void loginStep(String username,String password,String expected){
        BasePage basePage = new BasePage();
        basePage.open();
        ElementPage elementPage = basePage.elementPage();
        elementPage.goLoginForm();
        basePage.goIframe();
        elementPage.sendUsername(username);
        elementPage.sendPassword(password);
        elementPage.login();
        String errorMsg = elementPage.getErrorMsg();
        Assert.assertEquals(errorMsg,expected);
        basePage.pause(2);
        basePage.close();
    }
}
