package com.bilibili.demo.多态;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:多态的初步学习，必须有继承关系
 * @Author rong.wang
 * @Date 2020/6/14
 **/

public class Test01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();

        Cat cat = new Cat();
        cat.move();

        Bird bird = new Bird();
        bird.move();

//        //编译报错，因为Dog类和Animal类没有继承关系，无法使用多态特性
//        Animal animal1 = new Dog();


        /**
         * 1.什么是多态：
         *      多种状态，多种形态,父类型引用指向子类对象
         *      编译的时候一种形态，运行的时候一种形态
         *
         * 2.分析a2.move();
         * java程序分为编译阶段和运行阶段
         * 编译阶段：
         *      对于编译器来说，编译器只知道a2的类型是Animal，所以编译器在检查语法的时候回去Animal.class中寻找move()方法
         *      ，找到了move()方法后，编译通过，静态绑定成功（编译阶段称为静态绑定）
         * 运行阶段：
         *      实际上在堆内存中创建的java对象是Cat类型对象，所以调用move()方法的时候，实际上是Cat类型，所以运行阶段会
         *      动态执行 Cat对象的move()方法，这个阶段属于运行阶段绑定（运行阶段称为动态绑定）
         */
        Animal a2=new Cat();
        a2.move();

        //编译报错，因为编译器只知道a2的类型是Animal，所以编译器在检查语法的时候会去Animal.class中寻找catchMouse()方法
//        找不到，编译报错，无法执行（语法不合法）
//        a2.catchMouse();

        Animal a3=new Bird();
        a3.move();

        System.out.println("______________________________________________________________");
        /**
         * 什么时候使用向下转型
         *
         * 当访问的是子类中特有的方法时，必须使用向下转型
         *
         */
        Animal a4 = new Cat();
        Cat cat2 = (Cat) a4;
        cat2.catchMouse();

        /*
         * 运行报错
         * 因为猫 继承于动物，猫可以是动物，但是动物不一定是猫，无法将动物强转为猫
         * Cat c1 = (Cat) new Animal();
         */



    }
}

class Animal{
    public void move(){
        System.out.println("动物移动。。。");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    //抓老鼠方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}

class Dog{
    public void move() {
        System.out.println("狗子在追兔子");
    }
}
