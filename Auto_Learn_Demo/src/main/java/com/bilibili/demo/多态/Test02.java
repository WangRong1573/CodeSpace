package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/15
 **/

public class Test02 {
    public static void main(String[] args) {
        Animal x  = new Bird();
        Animal y=new Cat();

        if (x instanceof Bird){
            Bird bird = (Bird) x;
            bird.sing();
        }else if (x instanceof Cat){
            Cat cat = (Cat) x;
            cat.catchMouse();
        }

        if (y instanceof Bird){
            Bird bird = (Bird) y;
            bird.sing();
        }else if (y instanceof Cat){
            Cat cat = (Cat) y;
            cat.catchMouse();
        }
    }
}
