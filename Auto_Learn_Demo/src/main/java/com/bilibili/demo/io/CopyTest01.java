package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 字节流实现文件拷贝
 * @Author rong.wang
 * @Date 2020/8/4
 **/

public class CopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("E:\\test.txt");

            //写到硬盘时，没有文件会自动创建
            fos = new FileOutputStream("E:/des.txt");
//            //构造方法添加true参数表示在写的时候为追加，默认代表清空后再写
//            fos = new FileOutputStream("E:/des.txt",true);

            //一边读一边写
            byte[] bytes = new byte[10];
            int count = 0;

            while ((count = fis.read(bytes)) != -1){
                fos.write(bytes,0,count);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
