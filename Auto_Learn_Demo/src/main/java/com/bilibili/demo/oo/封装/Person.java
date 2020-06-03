package com.bilibili.demo.oo.封装;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 1.使用private修饰
 * 2.对外不公开，保证数据的安全
 * 3.使用static修饰的方法使用：类名.方法名（）或者方法名（）调用
 * 4.不使用static修饰的方法调用需要先new 对象；
 * <p>
 * 空指针异常最实质的原因：空引用指向“实例相关的数据（实例变量或者实例方法）”
 * @Author rong.wang
 * @Date 2020/6/3
 **/

public class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("请输入正确的数值");
            return;
        }
        this.age = age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(121);
        System.out.println(person.getAge());

        person.setAge(-100);
    }
}