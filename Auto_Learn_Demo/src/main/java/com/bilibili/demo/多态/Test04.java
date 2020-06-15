package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/15
 **/

public class Test04 {
    public void test04(Animal a){

        //因为此处无法判断a引用的类型是Cat还是Bird，当直接转成Cat或者Bird的时候就可能会出现类型转换异常
        if (a instanceof Cat){
            Cat cat=(Cat)a;
            cat.catchMouse();
        }else if (a instanceof Bird){
            Bird bird=(Bird)a;
            bird.sing();
        }
    }
}
