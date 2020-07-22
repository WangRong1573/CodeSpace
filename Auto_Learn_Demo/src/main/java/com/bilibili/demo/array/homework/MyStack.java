package com.bilibili.demo.array.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:一维数组模拟压栈弹栈练习
 * @Author rong.wang
 * @Date 2020/7/22
 **/

public class MyStack {

    private Object[] ele;

    private int index;

    public MyStack() {
        ele = new Object[10];
        index = -1;
    }

    //压栈方法
    public void push(Object o){
        if (index >= ele.length-1){
            System.out.println("压栈失败");
            return;
        }
        System.out.println("压栈成功："+o+"栈帧指向："+ ++index);
    }

    //弹栈方法
    public void pop(Object o){
        if (index < 0){
            System.out.println("弹栈失败");
            return;
        }
        System.out.println("弹栈成功："+o+"栈帧指向："+ --index);
    }
}

