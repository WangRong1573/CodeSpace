package com.bilibili.demo.object;

import java.util.Objects;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:equals方法深层了解,此时Address类也需要对equals方法进行重写
 * @Author rong.wang
 * @Date 2020/7/20
 **/

public class equalsTest02 {
    public static void main(String[] args) {

    }
}

class User {

    String name;

    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof User)) {
            return false;
        }
        User u = (User) o;
        //当姓名和地址均一样时，认为是同一个user
        if (this.name.equals(u.name) && this.addr.equals(u.addr)) {
            return true;
        }
        return false;
    }
}

class Address {

    String city;

    String street;

    String zipCode;

    public Address() {
    }

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || !(o instanceof Address)){
            return false;
        }

        Address a = (Address) o;
        if (this.city.equals(a.city) && this.street.equals(a.street) && this.zipCode.equals(a.zipCode)){
            return true;
        }
        return false;
    }
}
