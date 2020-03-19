package com.test.log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/18
 **/

public class TestLog4j {
    private Logger logger=Logger.getLogger(TestLog4j.class);
    @Test
    public void testlog4j(){
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
