package com.study.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rong.wang
 * @date 21:00  2020/1/13
 * 泛型的认识
 *
 * 集合中的元素，可以是任意类型的对象（对象的引用），如果把某个对象放入list集合中，就会忽略他的类型，当做object处理
 *
 * 泛型：是规定了某个集合值可以存放特定类型的对象，并在编译期间进行类型检查，可以直接按指定类型获取集合元素，不需要强转
 */
public class TestGeneric {
    //带有泛型course的list集合
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }


    public void testAdd(){
        Course course=new Course("大学语文",1);
        courses.add(course);
        //这种编译会报错,泛型集合中不能添加泛型规定的类型以外的对象，否则会报错
        //courses.add("dddddd");

        Course course1=new Course("python",2);
        courses.add(course1);
    }

    public void testForeach(){
        for (Course c:courses) {
            System.out.println(c.id+":"+c.name);
        }
    }

    public static void main(String[] args) {
        TestGeneric tg=new TestGeneric();
        tg.testAdd();
        tg.testForeach();
    }
}
