package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: io流的学习
 * IO流：
 *      从硬盘到内存是输入流：Reader ，InputStream
 *      从内存到硬盘是输出流：Writer ，OutputStream
 * IO流的分类：
 *  1.按照流的方向分：
 *     输入流  输出流（是以内存为参照物）
 *  2.按照数据流的方式分
 *      字节流     字符流
 *
 *   tip:所有的流使用完后都要关闭
 *       输出流都有flush（）方法，在使用完后要调用flush（）方法将数据强制清空，清空管道
 *
 * @Author rong.wang
 * @Date 2020/8/3
 **/

public class IoTest01 {
    public static void main(String[] args) {
        //创建输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\test.txt");
//            int data = fis.read();
            //循环读取
            while (true){
                int data = fis.read();
                if (data == -1){
                    break;
                }
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
