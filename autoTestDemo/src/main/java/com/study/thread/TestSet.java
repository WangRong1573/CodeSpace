package com.study.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author rong.wang
 * @date 21:38  2020/1/13
 */
public class TestSet {

    public List<Course> coursesToSelect;

    public TestSet() {
        coursesToSelect = new ArrayList<Course>();
    }

    public void testAdd() {
        //实例化课程对象
        Course course = new Course("大学英语", 1);
        //将课程传入list中
        coursesToSelect.add(course);
        /**
         * 向list集合中指定索引位置添加元素
         */
        Course course1 = new Course("毛概理论", 2);
        coursesToSelect.add(0, course1);
        /**
         * 向list集合中添加多个元素
         */
        Course[] courses = {new Course("计算机基础", 3), new Course("java自动化基础", 4)};
        coursesToSelect.addAll(Arrays.asList(courses));

        //以数组形式向list集合中的指定位置添加元素使用addAll(index，element)方法，当指定的索引位置小于0，或者大于list的长度时，会报索引越界异常
    }

    /**
     * list集合的遍历
     */
    public void testForeach() {
        //使用foreach循环遍历list集合中的元素
        System.out.println("----------------------------------");
        System.out.println("可选择的课程有： ");
        for (Object c : coursesToSelect) {
            Course c2 = (Course) c;
            System.out.println(c2.id + ":" + c2.name);
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        TestSet ts=new TestSet();
        ts.testAdd();
        ts.testForeach();

        //创建一个学生对象
        Student student=new Student("小明");
        System.out.println("欢迎"+student.name+"选课！");
        //创建scanner类来获取键盘输入的课程id
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入课程ID：");
            String courseID=scanner.next();
            for (Course cr:ts.coursesToSelect) {
                if (courseID.equals(cr.id)){
                    student.courses.add(cr);
                }
            }
        }
        ts.testForeachForSet(student);
    }

    public void testForeachForSet(Student student){
        //输出学生所选的课程
        System.out.println(student.courses.size());
        for (Course cr:student.courses) {
            System.out.println("选择了课程"+cr.id+":"+cr.name);
        }
    }
}
