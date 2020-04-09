package com.imooc.business;

import com.imooc.page.Handle;
import org.testng.Assert;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/2
 **/

public class OtherHandle extends Handle {

    //下载app
    public void downloadApp(){
        driver.get("https://www.imooc.com/");
        click("下载APP");
        newWindowCreat("app");
        String downText = getText("顶尖公司");
        Assert.assertNotNull(downText);
        pause(2);
        quit();
    }
}
