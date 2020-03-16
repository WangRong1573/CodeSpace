package com.frame.demo.test;

import com.frame.demo.page.Page;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class TestFrame {
    @Test
    public void testLogin(){
        Page page = new Page();
        page.login("2154","4545","请先进行验证");
    }
}
