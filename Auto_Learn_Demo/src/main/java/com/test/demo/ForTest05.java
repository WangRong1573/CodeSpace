package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:找出0-100之间所有的质数（只能被1和自身整除的数）
 * @Author rong.wang
 * @Date 2020/5/12
 **/

public class ForTest05 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }
        }
    }
}
