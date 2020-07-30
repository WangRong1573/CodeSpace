package com.bilibili.demo.collection.map;

import java.util.HashMap;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: Map方法原理解析
 * @Author rong.wang
 * @Date 2020/7/30
 **/

public class MapTest03 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        /**
         * put方法原理解析：map.put(k,v)
         *  1.先将k封装到node对象中
         *  2.底层调用k的hashCode()方法得到hash值，然后通过哈希算法将hash值转成数组下标，下标的位置上如果没有元素，就把
         *      node添加到这个元素下标位置上；如果下标位置有元素，此时会用k和链表上每一个节点的k进行equals比较，如果所有的
         *      equals方法都返回false，节点将被添加到链表的末尾；如果有equals返回true，那么节点的value将被覆盖
         *
         */
        map.put(1,"sss");


        /**
         * map.get(k)原理解析
         *  先调用k的hashCode()方法得到哈希值，通过哈希算法将哈希值转换成数组的下标，通过数组下标定位元素；
         *  如果下标对应元素什么也没有，返回null
         *  如果有链表，再用k和链表的k进行equals比较，如果所有的equals都返回false，返回null
         *  如果有equals返回true，则返回k对应的value
         */
        map.get(1);
    }
}
