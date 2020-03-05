package com.java.practice;

import java.util.Arrays;

/**
 * @author rong.wang
 * @date 20:30  2020/3/5
 * 数组的定义和遍历
 */
public class ArraysDemo {
    public static void main(String[] args) {

        twoArray();
    }

    public void arr01(){
        //数组的定义:语法  数据类型[] 数组名；
        int[] score;
        score= new int[]{31, 25, 69, 75, 79, 69, 95, 42};
    }

    //数组的遍历
    public void forArray(){
        int[] score={31, 25, 69, 75, 79, 69, 95, 42};
        for (int i = 0; i <score.length ; i++) {
            System.out.println(score[i]);
        }
    }

    //数组的遍历2
    public void forArray2(){
        int[] score={31, 25, 69, 75, 79, 69, 95, 42};
        for (int s:score) {
            System.out.println(s);
        }
    }

    //数组的排序
    public void arraySort(){
        int[] score={31, 25, 69, 75, 79, 69, 95, 42};
        //语法Arrays.sort(数组名);
        Arrays.sort(score);
        //数组转化为字符串
        System.out.println(Arrays.toString(score));
    }

    //二维数组
    //语法：数据类型[][] 数组名=new 数据类型[行的个数][列的个数]；  数组名[行的索引][列的索引]=值；
    public static void twoArray(){
        int[][] scores={{19,73},{44,65,99},{55}};
        //二维数组遍历
        for (int i = 0; i <scores.length ; i++) {
            for (int j = 0; j <scores[i].length ; j++) {
                System.out.print(scores[i][j]+"\t");
            }
        }
    }
}
