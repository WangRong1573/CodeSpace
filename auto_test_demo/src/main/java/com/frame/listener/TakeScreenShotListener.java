package com.frame.listener;

import com.frame.driver.GetDriver;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:监听类，实现失败自动截图功能
 * @Author rong.wang
 * @Date 2020/3/26
 **/

public class TakeScreenShotListener extends TestListenerAdapter {
    private Logger logger=Logger.getLogger(TakeScreenShotListener.class);
    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        takeScreenShot(tr);
        logger.info("脚本报错，自动截图成功");
    }

    public void takeScreenShot(ITestResult tr){
        GetDriver instance = (GetDriver) tr.getInstance();
        instance.screenShot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
        super.onTestFailedButWithinSuccessPercentage(tr);
    }

    @Override
    public void onStart(ITestContext testContext) {
        super.onStart(testContext);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }
}
