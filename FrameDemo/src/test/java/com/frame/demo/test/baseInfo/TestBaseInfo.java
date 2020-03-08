package com.frame.demo.test.baseInfo;

import org.junit.Test;

import static com.frame.demo.utils.BaseInfo.getInfo;

/**
 * @author rong.wang
 * @date 17:55  2020/3/8
 */
public class TestBaseInfo {

    @Test
    public void test(){
        String browerName = getInfo("browerName");
        System.out.println(browerName);
    }
}
