package com.demo.util;

import java.lang.reflect.Field;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/4
 **/

public class ReflectUtil {
    //将object类型对象转换成json字符串
    public static StringBuilder jsonObject(Object obj) {
        Class<?> objClass = null;
        StringBuilder str = null;
        Field[] fields = null;
        try {
            //获取当前对象所在的class文件
            objClass = obj.getClass();
            //获取class文件的所有属性
            fields = objClass.getDeclaredFields();

            str = new StringBuilder("{");
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                //设置私有访问权限属性可以在class文件外部使用
                field.setAccessible(true);
                //属性名
                String name = field.getName();
                //属性值
                Object value = null;
                value = field.get(obj);
                //将属性名和属性值拼接成json字符串
                str.append("\"");
                str.append(name);
                str.append("\"");
                str.append(":");
                str.append("\"");
                str.append(value);
                str.append("\"");
                if (i < fields.length - 1) {
                    str.append(",");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            str.append("}");
        }
        return str;
    }
}
