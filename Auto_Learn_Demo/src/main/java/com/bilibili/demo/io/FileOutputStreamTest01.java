package com.bilibili.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 输出流
 * @Author rong.wang
 * @Date 2020/8/4
 **/

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");

            byte[] bytes = {97,98,99,100};

            fos.write(bytes);

            //输出流要调用flush()
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
