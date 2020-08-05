package com.bilibili.demo.io.file;

import java.io.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/8/5
 **/

public class Homework3 {
    public static void main(String[] args) {
        File src = new File("G:\\CodeSpace\\HelloWord");

        File dest = new File("D:\\");

        copy(src,dest);
    }

    /**
     *
     * @param src
     * @param dest
     */
    public static void copy(File src,File dest){
        if (src.isFile()){
            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis = new FileInputStream(src);

                String path = (dest.getAbsolutePath().endsWith("\\") ? dest.getAbsolutePath() : dest.getAbsolutePath() + "\\") + src.getAbsolutePath().substring(3);

                fos = new FileOutputStream(path);

                byte[] bytes = new byte[1024 * 1024];
                int count = 0;
                while ((count = fis.read(bytes)) != -1){
                    fos.write(bytes,0,count);
                }
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

                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] files = src.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                String path = (dest.getAbsolutePath().endsWith("\\") ? dest.getAbsolutePath() : dest.getAbsolutePath() + "\\") + file.getAbsolutePath().substring(3);
                File newFile = new File(path);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copy(file,dest);
        }
    }
}
