package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: FileInputStream的其他常用方法
 *  1.available()  返回从此输入流中可以读取（或跳过）的剩余字节数的估计值，而不会被下一次调用此输入流的方法阻塞。
 *                  返回流当中剩余的没有读到的字节数
 *  2.skip(long n)  跳过并从输入流中丢弃 n字节的数据。
 *                  跳过几个字节不读
 * @Author rong.wang
 * @Date 2020/8/3
 **/

public class IoTest04 {
    public static void main(String[] args) {
        //利用 available()
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\test.txt");
            //未读取时返回总字节数量
//            int available = fis.available();
//            System.out.println("总字节数量为："+available);

            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            System.out.print("文件内容为："+new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
