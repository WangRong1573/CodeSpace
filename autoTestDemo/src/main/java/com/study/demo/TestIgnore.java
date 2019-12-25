package com.study.demo;

import org.testng.annotations.Test;

/**
 * 忽略测试
 * enable==false时生效，不会执行当前标记的测试方法
 * enable==true时，表示不禁用当前测试方法
 * @author rong.wang
 * @date 20:41  2019/12/25
 */
public class TestIgnore {
    @Test(enabled = false)
    public void testIgnore(){
        System.out.println("这条测试将会被忽略");
    }

    @Test(enabled = true)
    public void testTrue(){
        System.out.println("默认值为enabled==true");
    }

    @Test
    public void test(){
        System.out.println("不传时等价于enabled==true");
    }
}
