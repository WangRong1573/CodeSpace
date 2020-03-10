package com.java.test;

/**
 * @author rong.wang
 * @date 20:56  2020/3/10
 */
public class Test {
    @org.testng.annotations.Test
    public void test(){
        Animal animal = new Animal();
        animal.sleep();
        animal.run();

        Dog dog = new Dog();
        dog.sleep();
        dog.run();

        Cat cat = new Cat();
        cat.sleep();
        cat.run();

        Animal obj1=new Dog();
        Animal obj2=new Cat();
        if (obj1 instanceof Cat){
            obj1=new Cat();
        }else {
            System.out.println("类型转换错误");
        }

        if (obj2 instanceof Cat){
            obj2=new Dog();
        }else {
            System.out.println("类型转换错误");
        }
    }
}
