package com.frame.demo.test.elementdata;

import com.frame.demo.utils.ReadExcelUtil;
import org.junit.Test;

import java.util.Map;

/**
 * @author rong.wang
 * @date 18:13  2020/3/8
 */
public class GetElementData {

    @Test
    public void test(){
        Map<String, String> elementData = ReadExcelUtil.getElementData();
        System.out.println(elementData);
    }
}
