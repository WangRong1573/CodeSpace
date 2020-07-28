package com.bilibili.demo.collection;

import com.bilibili.demo.exception1.homework.Plane;
import org.apache.xpath.operations.String;

import java.util.HashSet;
import java.util.Iterator;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/7/28
 **/

public class CollectionTest01 {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        //集合中添加元素
        //集合中不可直接添加基本数据类型
        //此处为自动装箱
        set.add(100);
        set.add(new Object());
        set.add(new Plane());

        //集合中元素的个数
        System.out.println(set.size());

        //清空集合中的元素
        set.clear();
        System.out.println(set.size());

        set.add("hello");
        set.add("world");
        set.add("钢铁侠");

        //集合中是否包含某元素
        System.out.println(set.contains("hello"));

        //迭代器遍历
        //hasNext 表示是否还有下一个元素，有则返回true
        Iterator<Object> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //contains方法底层分析，底层重写了equals方法

    }
}

