package com.frame.demo.test.log4j;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author rong.wang
 * @date 16:24  2020/3/8
 * 用于测试log4j配置是否正确
 */
public class TestLog {

    private Logger logger=Logger.getLogger(TestLog.class);

    @Test
    public void test(){
        logger.info("this is info message!");
        logger.error("this is erroe message");
    }
}
