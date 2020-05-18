package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:找出1-100之间的素数，并每8个1行输出
 * 1.for循环的练习
 * 2.for循环的嵌套
 * 3.break的使用
 * 4.循环的统计
 * @Author rong.wang
 * @Date 2020/5/18
 **/

public class ForTest06 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i <=100 ; i++) {
            boolean isSuShu=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isSuShu=false;
                    break;
                }
            }
            if (isSuShu){
                System.out.print(i+" ");
                count++;
                if (count%8==0){
                    System.out.println();
                }
            }
        }
    }
}
