package com.test.log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:测试log4j
 * @Author rong.wang
 * @Date 2020/3/31
 **/

public class TestLog {
    private Logger logger=Logger.getLogger(TestLog.class);

    public void testLog(){
        logger.info("this is message");
        logger.error("this is error message");
    }

    @Test
    public void test(){
        this.testLog();
    }
}
