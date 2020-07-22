package com.bilibili.demo.array.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/7/22
 **/

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("aaaa1");
        stack.push("aaaa2");
        stack.push("aaaa1");
        stack.push("aaaa2");
        stack.push("aaaa1");
        stack.push("aaaa2");


        stack.pop("aaaa2");

    }
}
