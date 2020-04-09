package com.imooc.cases;

import com.imooc.base.DriverBase;
import com.imooc.business.OtherHandle;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/2
 **/

public class TestDownload extends DriverBase {

    @Test
    public void testDownloadApp(){
        new OtherHandle().downloadApp();
    }
}
