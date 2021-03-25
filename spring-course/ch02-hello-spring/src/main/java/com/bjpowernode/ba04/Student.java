package com.bjpowernode.ba04;


/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/24
 **/

public class Student {
   private Integer id;
   private String name;
   private School school;

    public Student() {
    }

    public Student(Integer Mid, String Mname, School Mschool) {
        this.id = Mid;
        this.name = Mname;
        this.school = Mschool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school=" + school +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
