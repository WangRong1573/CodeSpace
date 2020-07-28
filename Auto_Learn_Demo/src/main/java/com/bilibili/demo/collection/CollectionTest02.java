package com.bilibili.demo.collection;

import java.util.ArrayList;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:  放在集合里的对象要重写equals方法
 * @Author rong.wang
 * @Date 2020/7/28
 **/

public class CollectionTest02 {
    public static void main(String[] args) {
        ArrayList<User> it = new ArrayList<>();
        User u1 = new User("jack");
        User u2 = new User("jack");
        it.add(u1);

        //当User未重写equals方法时，返回false，因为是两个不同的对象，未重写equals方法时比较的是两个对象的内存地址
        System.out.println(it.contains(u2));

        //User类重写了equals方法后，认为两个对象的name属性相等则为同一对象，contains方法底层调用equals方法
        System.out.println(it.contains(u2));

        //remove()方法同contains方法
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (null == o || !(o instanceof User)){
            return false;
        }
        User user = (User) o;
        return this.name.equals(user.name);
    }
}