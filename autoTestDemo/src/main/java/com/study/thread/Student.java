package com.study.thread;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rong.wang
 * @date 21:39  2020/1/13
 */
public class Student {
    String name;
    Set<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses=new HashSet<Course>();
    }
}
