package com.frame.log4j;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class Log4j {
    private Logger logger=Logger.getLogger(Log4j.class);
    @Test
    public void test(){
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
