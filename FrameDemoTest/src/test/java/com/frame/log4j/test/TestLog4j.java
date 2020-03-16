package com.frame.log4j.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/16
 **/

public class TestLog4j {
    private Logger logger=Logger.getLogger(TestLog4j.class);

    @Test
    public void testLog4j(){
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
