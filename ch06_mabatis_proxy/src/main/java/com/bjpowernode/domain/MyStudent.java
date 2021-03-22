package com.bjpowernode.domain;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/22
 **/

public class MyStudent {
    private Integer stuid;
    private String Stuname;
    private Integer stuage;

    public MyStudent() {
    }

    public MyStudent(Integer stuid, String stuname, Integer stuage) {
        this.stuid = stuid;
        Stuname = stuname;
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "stuid=" + stuid +
                ", Stuname='" + Stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return Stuname;
    }

    public void setStuname(String stuname) {
        Stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }
}
