package com.study.thread;

import java.util.HashSet;
import java.util.Set;

/**课程类
 * @author rong.wang
 * @date 20:00  2020/1/13
 */
public class Course {
    public String name;
    public int id;
    public Set courses;

    public Course() {
    }

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Course(String name, int id, Set courses) {
        this.name = name;
        this.id = id;
        this.courses = new HashSet();
    }
}
