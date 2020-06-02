package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:java中值的传递
 * java中规定：参数传递的时候，和类型无关，统一都是将盒子中保存的“值”（数值或者空间地址）复制一份传递下去
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class Test1 {
    public static void main(String[] args) {
        int i=10;

        add(i);
        System.out.println("main--->"+i);//10
    }

    public static void add(int i){
        i++;
        System.out.println("add-->"+i);//11
    }
}
