package com.bilibili.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 实现线程的第三种方式，实现Callable接口,JDK新特性，8以后
 * @Author rong.wang
 * @Date 2020/8/11
 **/

public class ThreadTest07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //匿名内部类方式实现
        //参数非常重要，需要给一个Callable接口的实现类
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run方法，只不过有返回值
                //线程执行一个任务，执行之后可能会有一个返回结果
                //模拟执行
                System.out.println("call method begin");

                Thread.sleep(1000 * 10);

                System.out.println("call method over");

                int a = 10;
                int b = 20;
                return a + b; //自动装箱，call方法的返回值类型是object
            }
        });

        //创建线程对象
        Thread t = new Thread(task);

        //线程启动
        t.start();

        //这里是main方法，get方法的执行会导致“当前线程阻塞”，因为get会等待线程执行完成后得到的结果
        Object o = task.get(); //此处会有异常
        System.out.println("线程执行结果"+o);

        System.out.println("hello world");
    }
}
