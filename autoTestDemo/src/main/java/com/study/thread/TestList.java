package com.study.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rong.wang
 * @date 20:02  2020/1/13
 */
public class TestList {
    //备选课程
    public List coursesToSelect;

    public TestList() {
        this.coursesToSelect=new ArrayList();
    }

    //向list中添加元素
    public void testAdd(){
        //实例化课程对象
        Course course=new Course("大学英语",1);
        //将课程传入list中
        coursesToSelect.add(course);
        //获取list中的元素
        Course temp= (Course) coursesToSelect.get(0);
        System.out.println("添加了课程："+temp.id+":"+temp.name);

        /**
         * 向list集合中指定索引位置添加元素
         */
        Course course1=new Course("毛概理论",2);
        coursesToSelect.add(0,course1);
        Course temp2= (Course) coursesToSelect.get(0);
        System.out.println("向指定位置添加了课程："+temp2.id+":"+temp2.name);

        /**
         * 向list集合中添加多个元素
         */
        Course[] courses={new Course("计算机基础",3),new Course("java自动化基础",4)};
        coursesToSelect.addAll(Arrays.asList(courses));
        //obiect对象类型强转为course对象
        Course temp3= (Course) coursesToSelect.get(2);
        Course temp4= (Course) coursesToSelect.get(3);
        System.out.println("数组形式添加了课程："+temp3.id+":"+temp3.name+"\t"+temp4.id+":"+temp4.name);

        //以数组形式向list集合中的指定位置添加元素使用addAll(index，element)方法，当指定的索引位置小于0，或者大于list的长度时，会报索引越界异常

        //第一种形式遍历list集合中的元素，利用list的size（）方法获取集合的长度，for循环
        int size=coursesToSelect.size();
        System.out.println("----------------------------------");
        System.out.println("可选择的课程有： ");
        for (int i = 0; i <size ; i++) {
            Course cr= (Course) coursesToSelect.get(i);
            System.out.println(cr.id+":"+cr.name);
        }


    }

    /**
     *list集合的遍历
     */
    public void testForeach(){
        //使用foreach循环遍历list集合中的元素
        System.out.println("----------------------------------");
        System.out.println("可选择的课程有： ");
        for (Object c:coursesToSelect) {
            Course c2= (Course) c;
            System.out.println(c2.id+":"+c2.name);
        }
    }


    /**
     *修改list集合中的元素
     */
    public void testModify(){
        coursesToSelect.set(0,new Course("selenium进阶",5));
    }

    /*
    *删除list集合中的某个元素
     */
    public void testRemove(){
        coursesToSelect.remove(0);
    }

    public static void main(String[] args) {
        TestList tl=new TestList();
        tl.testAdd();

        tl.testModify();
        tl.testForeach();

        tl.testRemove();
        tl.testForeach();
    }
}
