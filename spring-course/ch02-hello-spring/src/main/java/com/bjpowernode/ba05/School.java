package com.bjpowernode.ba05;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/24
 **/

public class School {
    private String name;
    private String addr;

    public School() {
    }

    public School(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
