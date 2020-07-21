package com.bilibili.demo.array;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:数组作为参数，数组遍历，数组中存储引用数据类型，数组的长度
 * @Author rong.wang
 * @Date 2020/7/21
 **/

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] as = {1, 3, 5, 78, 698, 654, 52};
        new ArrTest().m(as);

        Bird bird = new Bird();
        Cat cat = new Cat();

        Animal[] ans = {bird, cat};
        for (int i = 0; i < ans.length; i++) {
            ans[i].move();
        }


        Animal a1 = new Bird();
        Animal a2 = new Cat();
        if (a1 instanceof Cat) {
            Cat a11 = (Cat) a1;
            a11.eatMouse();
        } else if (a1 instanceof Bird) {
            Bird b1 = (Bird) a1;
            b1.eat();
        } else {
            throw new RuntimeException("类型不匹配");
        }
        if (a2 instanceof Cat) {
            Cat a21 = (Cat) a2;
            a21.eatMouse();
        } else if (a2 instanceof Bird) {
            Bird b2 = (Bird) a2;
            b2.eat();
        } else {
            throw new RuntimeException("类型不匹配");
        }
    }
}

class ArrTest {
    public void m(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组中下标为" + i + "的值为：" + arr[i]);
        }
    }
}

class Animal {
    public void move() {
        System.out.println("在移动");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫咪在走猫步");
    }

    public void eatMouse() {
        System.out.println("毛吃老鼠");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public void eat() {
        System.out.println("小鸟吃虫子");
    }
}
