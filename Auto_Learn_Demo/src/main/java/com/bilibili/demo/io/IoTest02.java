package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 采用数组方式读取，读取个数为字节数组的默认长度
 * @Author rong.wang
 * @Date 2020/8/3
 **/

public class IoTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] bytes = new byte[4];
        try {
            //文件内容是abcdef
             fis= new FileInputStream("E:\\test.txt");
             //返回读取到的字节数量readCount，字节数量等于数组的长度
            int readCount = fis.read(bytes);
            System.out.println(readCount);
            //将字节数组转成字符串，每次读取长度
            System.out.println(new String(bytes,0,readCount));//abcd

            /*//继续读取,因为第一次读取内容为abcd，再次读取ef时放在了数组的下标0,1位置
            readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes));//efcd*/

            readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes,0,readCount));

            //读取不到，返回-1
            readCount = fis.read(bytes);
            System.out.println(readCount);


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
