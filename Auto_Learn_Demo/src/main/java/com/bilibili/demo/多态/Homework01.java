package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/15
 **/

public class Homework01 {
    public static void main(String[] args) {
        Master master = new Master();
        master.feed(new Cat2());
        master.feed(new YingWu());
    }
}

class Master{
    public void feed(Pet pet){
        if (pet instanceof Cat2){
            Cat2 cat2=(Cat2)pet;
            cat2.eat();
        }else if (pet instanceof Dog2){
            Dog2 dog2=(Dog2)pet;
            dog2.eat();
        }else if (pet instanceof YingWu){
            YingWu yingWu=(YingWu)pet;
            yingWu.eat();
        }
    }
}

class Pet{
    public void eat(){
        System.out.println("宠物吃饭");
    }
}

class Cat2 extends Pet{
    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }
}

class Dog2 extends Pet{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }
}

class YingWu extends Pet{
    @Override
    public void eat() {
        System.out.println("饿了会会说话");
    }
}
