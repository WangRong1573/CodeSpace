package com.bilibili.demo.thread.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:守护线程实现定时器
 * 作用：间隔特定的时间执行特定的程序
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Test t = new Test();
        Timer timer = new Timer();
        //Timer timer = new Timer(); 守护线程的方式

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = dateFormat.parse("2020-08-11 21:25:00");
        //第一个参数为需要执行的任务
        //第二个参数是任务开始时间
        //第三个参数是执行任务的时间间隔毫秒数
        timer.schedule(t,firstTime,1000 * 10);
    }
}

//定时任务类，继承TimerTask抽象类，实现run方法
class Test extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        System.out.println(date+"数据备份成功");
    }
}
