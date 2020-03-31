package com.test.element;

import com.imooc.utils.ReadExcelUtil;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class TestFindElement {
    @Test
    public void findElement(){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        String method = elementData.get("用户名").toString().split(",")[0];
        String value= elementData.get("用户名").toString().split(",")[1];
        System.out.println(method+","+value);
    }
}
