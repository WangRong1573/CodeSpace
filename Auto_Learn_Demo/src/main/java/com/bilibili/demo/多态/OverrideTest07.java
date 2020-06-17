package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:私有方法不能重写
 * @Author rong.wang
 * @Date 2020/6/17
 **/

public class OverrideTest07 {

    //私有方法
    private void doSome(){
        System.out.println("OverrideTest07's doSome method execute");
    }

    public static void main(String[] args) {
        OverrideTest07 t = new T();
        t.doSome(); //执行结果：OverrideTest07's doSome method execute
    }
}

class T extends OverrideTest07{
    //尝试重写父类中的私有方法
    private void doSome(){
        System.out.println("T's doSome method execute");
    }
}
