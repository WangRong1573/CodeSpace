package com.study.demo;

import org.testng.annotations.Test;

/**
 * 异常测试--超时测试：比如硬等待超出设定时间
 * 可用于定位元素时抛出超时异常
 * @author rong.wang
 * @date 22:15  2019/12/25
 */
public class TestTimeOut {
    @Test(timeOut = 3000)
    public void testTimeOut(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("超时了");
    }
}
