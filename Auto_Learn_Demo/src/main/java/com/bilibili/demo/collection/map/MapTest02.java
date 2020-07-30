package com.bilibili.demo.collection.map;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: Map的遍历集中方法
 * @Author rong.wang
 * @Date 2020/7/30
 **/

public class MapTest02 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"v");
        map.put(6,"j");
        map.put(9,"o");

        //方法1：通过遍历key来获取value
        Set<Integer> it = map.keySet();
        Iterator<Integer> iterator = it.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            String s = map.get(next);
            System.out.println(s);
        }

        System.out.println("====================================");
        //方法2：foreach循环遍历集合
        for (Integer s1:it){
            System.out.println(map.get(s1));
        }


        System.out.println("====================================");
        //方法3：将Map转成Set
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> set = entries.iterator();
        while (set.hasNext()){
            Map.Entry<Integer, String> node = set.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"-->"+value);
        }


        System.out.println("====================================");
        //foreach
        for (Map.Entry<Integer,String> i:entries){
            System.out.println(i.getKey()+"=="+i.getValue());
        }
    }
}
