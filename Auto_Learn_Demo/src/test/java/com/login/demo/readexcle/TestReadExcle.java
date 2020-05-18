package com.login.demo.readexcle;

import com.login.demo.utils.ReadExcelUtil;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/14
 **/

public class TestReadExcle {
    @Test
    public void testReadExcle(){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String locatorType = elementData.get("登录").split(",")[0];
        String value= elementData.get("登录").split(",")[1];
        System.out.println(locatorType+"\t"+value);
    }
}
