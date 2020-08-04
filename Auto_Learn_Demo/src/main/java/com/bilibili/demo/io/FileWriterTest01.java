package com.bilibili.demo.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 字符输出流
 * @Author rong.wang
 * @Date 2020/8/4
 **/

public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //true表示追加输出
            fw = new FileWriter("E:/fw.txt",true);

            //直接写字符串
            String s = "这是一段字符串将被写到硬盘中去";
            fw.write(s);

            char[] chars = {'这','是','以','个','数'};
            //输出换行符
            fw.write("\n");
            fw.write(chars);

            fw.write(chars,0,2);

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
