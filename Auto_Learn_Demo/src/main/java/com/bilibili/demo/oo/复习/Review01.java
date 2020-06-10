package com.bilibili.demo.oo.复习;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/10
 **/

public class Review01 {

    static {
        System.out.println("Review类加载时执行");
    }
    //静态方法
    public static void main(String[] args) {
        //局部变量
        int i=100;

        Student student = new Student("Jack", 10023);
        student.study();

        Student student1 = new Student();

    }
}

//学生类
class Student{

    private String name;

    private int no;

    //静态变量
    static String job="学习";

    static {
        System.out.println("student 类加载时执行");
    }

    {
        System.out.println("实力语句块执行，在构造方法执行每执行一次，实例语句就执行一次");
    }
    //构造方法
    public Student() {
        //默认创建的为张三，10001
        this("张三",10001);
    }

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    //静态方法
    public void m1(){
        System.out.println("静态方法 m1 execute");
    }

    //实例方法
    public void study(){
        System.out.println(this.getName()+"正在努力的学习");
//        this.eat();
        eat();
        m1();
    }

    public void eat(){
        System.out.println(this.getName()+"正在吃饭");
    }

}