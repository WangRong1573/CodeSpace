package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:为什么使用instanceof运算符？
 *      在分工协作时候，提供一个方法给别人去调用，无法确认别人传进来的是那种类型的对象，需要在运行时动态判断
 * @Author rong.wang
 * @Date 2020/6/15
 **/

public class Test03 {
    public static void main(String[] args) {
        Test04 test04 = new Test04();
        test04.test04(new Cat());
        test04.test04(new Bird());
    }
}
