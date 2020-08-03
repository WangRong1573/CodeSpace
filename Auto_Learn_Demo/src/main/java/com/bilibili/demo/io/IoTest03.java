package com.bilibili.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: byte[]数组方式读取文件内容最终版
 * @Author rong.wang
 * @Date 2020/8/3
 **/

public class IoTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\test.txt");
            //准备一个byte数组
            byte[] bytes = new byte[4];
            //向byte数组中读数据
            while (true){
                int readCount = fis.read(bytes);
                //如果返回-1说明文件内容为空
                if (readCount == -1){
                    break;
                }
                //执行到此处说明读到了
                System.out.print(new String(bytes,0,readCount));
            }
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
