package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class StudentTest {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.country="China";
        addr.city="河南";
        addr.youBian=1827L;

        Student student = new Student();
        student.name="张三";
        student.age=20;
        student.address=addr;

        System.out.println(student.name+"今年"+student.age+"了，来自"+student.address.country+
                student.address.city+",邮编是"+student.address.youBian);
    }
}
