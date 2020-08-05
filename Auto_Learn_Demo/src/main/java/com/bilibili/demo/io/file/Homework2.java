package com.bilibili.demo.io.file;

import java.io.*;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description: 再次练习，步骤练习
 * @Author rong.wang
 * @Date 2020/8/5
 **/

public class Homework2 {
    public static void main(String[] args) {
        File src = new File("G:\\Download");

        File dest = new File("D:\\test");

        copy(src,dest);
    }

    public static void copy(File src , File dest){

        if (src.isFile()){

            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis = new FileInputStream(src);

                String srcPath = src.getAbsolutePath();
//                System.out.println(srcPath);
                String destPath = dest.getAbsolutePath();
//                System.out.println(destPath);

                String path = (destPath.endsWith("\\") ? destPath : destPath+"\\")+srcPath.substring(3);

                fos =new FileOutputStream(path);

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
//            System.out.println(file.getAbsolutePath());
            //如果是目录，新建对应的目录
            if (file.isDirectory()){
                //G:\CodeSpace\HelloWord\images\bg01.jpg  源目录
                //目标目录：D:\CodeSpace\HelloWord\images\bg01.jpg
                //既是从\位置以后开始截取字符串

                String srcPath = file.getAbsolutePath();
//                System.out.println(srcPath);
                String destPath = dest.getAbsolutePath();
//                System.out.println(destPath);

                String path = (destPath.endsWith("\\") ? destPath : destPath+"\\")+srcPath.substring(3);

                System.out.println(path);

                File newFile = new File(path);
                //目录不存在时创建
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copy(file,dest);
        }
    }
}
