package com.bilibili.demo.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: List接口中特有的方法
 *
 * ArrayList 底层是Object[]数组，默认是个空（查看源码），当添加第一个元素时默认初始化容量为10
 *      数组的扩容效率低
 *          优化方法：
 *              List list = new ArrayList("默认数量");给定预估合适的初始化容量，减少数组的扩容次数
 * @Author rong.wang
 * @Date 2020/7/29
 **/

public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //继承自Iterable.向集合末尾添加元素
        list.add("A");
        list.add("B");
        list.add("C");

        //遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //向集合指定索引位置添加元素
        list.add(0,"AB");
        System.out.println(list.size());

        //当集合结构产生变化时，对集合的遍历，删除都需要重新获取迭代器对象
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //获取指定索引的元素，返回指定索引位置的元素对象
        Object o = list.get(0);
        System.out.println(o);

        //int indexOf(Object o)  返回元素的索引/下标
        //对集合的删除最好使用迭代器对象的remove()方法

        //对集合指定索引位置的元素进行修改
        list.set(0,"DDD");

        System.out.println(list.get(0));
    }
}
