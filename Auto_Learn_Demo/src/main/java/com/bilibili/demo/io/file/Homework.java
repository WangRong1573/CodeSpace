package com.bilibili.demo.io.file;

import java.io.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 目录的拷贝
 * 知识点：
 *  File类的常用方法
 *  输入流/输出流
 *  递归
 * @Author rong.wang
 * @Date 2020/8/5
 **/

public class Homework {
    public static void main(String[] args) {
        File src = new File("G:\\CodeSpace\\HelloWord");

        File dest = new File("D:\\");

    /*    System.out.println(src.getAbsolutePath().substring(3));
        System.out.println(dest.getAbsolutePath());*/
        copy(src,dest);
    }

    /**
     * 目录拷贝方法
     * @param src 表示源目录
     * @param dest 表示目标目录
     */
    public static void copy(File src,File dest){

        //拷贝需要改变文件路径
        String srcPath = src.getAbsolutePath();
        String destPath = dest.getAbsolutePath();
        //destPath + srcPath.substring(3);subString(3)表示截取掉“D:\\”
        //判断目标路径是否以/结尾
//        String path = destPath.endsWith("\\") ? destPath + srcPath.substring(3) : destPath+"\\"+srcPath.substring(3);

        String path = destPath.endsWith("\\") ? destPath + srcPath : destPath+"\\"+srcPath.substring(3);

        //递归结束条件,如果源文件是一个文件拷贝后结束则递归结束
        if (src.isFile()){
            //输入流输出流

            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis =new FileInputStream(src);

                fos = new FileOutputStream(path);

                byte[] bytes = new byte[10 * 1024];
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
        //获取文件子目录
        File[] files = src.listFiles();
        //遍历
        for (File file : files){
            if (file.isDirectory()){
                File newFile = new File(path);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copy(file,dest);
        }
    }
}
