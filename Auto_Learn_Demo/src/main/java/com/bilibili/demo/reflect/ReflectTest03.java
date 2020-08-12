package com.bilibili.demo.reflect;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 通过读属性配置文件来实例化对象，可使程序更加灵活
 * 优点：
 *      java代码写一遍，在不改变java源代码的基础上，只需要修改配置文件，就可以做到对不同对象的实例化
 *      符合OCP开闭原则：对拓展开放，对修改关闭
 * @Author rong.wang
 * @Date 2020/8/12
 **/

public class ReflectTest03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        FileReader reader = new FileReader("config.properties");

        Properties properties = new Properties();

        properties.load(reader);

        String className = properties.getProperty("className");

        Class<?> name = Class.forName(className);

        Object o = name.newInstance();

        System.out.println(o);
    }
}
