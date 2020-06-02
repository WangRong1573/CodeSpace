package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:学习java空指针异常
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class NullPointerTest {

    public static void main(String[] args) {
        Custom custom = new Custom();
        System.out.println(custom.id);

        custom.id=10086;
        System.out.println(custom.id);

        //此处演示空指针异常，既是空引用指向成员变量（实例变量）
        //NullPointerException
        custom=null;
        System.out.println(custom.id);
    }
}

class Custom{
    int id;
}
