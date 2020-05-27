package com.test.demo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:1.方法自己调用自己，就是递归
 * 2.当递归没有结束条件，一定会发生栈内存溢出
 * 3.递归一定要有结束条件
 * 4.会有情况出现，结束条件是合法的也会出现内存溢出的情况
 * 5.不建议使用递归，能用for、while代替的，尽量使用循环，因为循环的效率高，耗费内存小，递归占用内存较大，极少数情况下是必须使用递归的
 * @Author rong.wang
 * @Date 2020/5/27
 **/

public class DiGuiTest {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);

        int sum1 = DiGui.sum(100);
        System.out.println(sum1);
    }

    public static int sum(int n){
        int sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i;
        }
        return sum;
    }
}


//使用递归计算1-n的和
class DiGui{
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        //程序执行到此说明n不是1
        return n+sum(n-1);
    }
}