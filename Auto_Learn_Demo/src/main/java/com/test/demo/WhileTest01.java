package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:while的练习；回顾运算只在执行时进行，编译器不进行运算
 * @Author rong.wang
 * @Date 2020/5/13
 **/

public class WhileTest01 {
    public static void main(String[] args) {
        //此写法编译报错
//        while (true){
//            System.out.println("hello world");
//        }
//        System.out.println("hello");

        //此写法编译通过，因为i，j的值在运行时从存储中获得，编译阶段无法比较得到结果
        int i=10;
        int j=3;
        while (i>j){
            System.out.println("hello world");
        }
        System.out.println("second");

//        //此写法编译报错
//        while (10>4){
//            System.out.println("-----");
//        }
//        System.out.println("xxxxx");

    }
}
