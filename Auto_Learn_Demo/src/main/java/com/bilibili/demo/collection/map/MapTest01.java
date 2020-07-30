package com.bilibili.demo.collection.map;

import java.util.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:Map接口常用方法练习
 * @Author rong.wang
 * @Date 2020/7/30
 **/

public class MapTest01 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //向集合中添加元素
        map.put(2,"AA");
        map.put(3,"VV");
        map.put(5,"value5");
        map.put(9,"VV3");

        //通过key获取value
        System.out.println(map.get(3));

        //集合长度
        System.out.println(map.size());

        //删除集合中某元素
        String s = map.remove(9);
        System.out.println(s);

        System.out.println(map.size());

        //判断集合是否包含key,value
        boolean b = map.containsKey(9);
        boolean value = map.containsValue("VV");
        System.out.println(value);
        System.out.println(b);

        //获取集合所有的key，可用来对集合进行遍历操作
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer node = it.next();
            String s1 = map.get(node);
            System.out.println(s1);
        }

        //获取集合中所有的value，可用于对集合value的遍历
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //将Map集合转换成Set集合，可用于集合的遍历
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
    }
}
