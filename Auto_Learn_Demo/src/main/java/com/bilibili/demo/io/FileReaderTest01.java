package com.bilibili.demo.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 字符流，只能用于读取纯文本文件例如txt，java结尾文件
 * @Author rong.wang
 * @Date 2020/8/4
 **/

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\test.txt");

            char[] chars = new char[10 * 1024];
            int count = 0;
            while ((count = fr.read(chars)) != -1){
                System.out.println(new String(chars,0,count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
