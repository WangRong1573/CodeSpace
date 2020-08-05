package com.bilibili.demo.io.file;

import java.io.File;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: File对象：文件和目录路径名的抽象表示
 *
 * @Author rong.wang
 * @Date 2020/8/5
 **/

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("G:\\CodeSpace\\HelloWord");

        //判断文件是否存在
        System.out.println(file.exists());

        //是否是目录
        System.out.println(file.isDirectory());

        //是否是文件
        System.out.println(file.isFile());

        //文件名
        System.out.println(file.getName());

        //绝对路径
        System.out.println(file.getAbsolutePath());

        //父级目录
        System.out.println(file.getParent());

        //返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] files = file.listFiles();
        for (File dir: files) {
            System.out.println(dir.getName());
        }


    }
}
