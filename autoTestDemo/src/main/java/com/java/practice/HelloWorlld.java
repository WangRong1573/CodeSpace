package com.java.practice;

/**
 * @author rong.wang
 * @date 20:47  2020/3/4
 * java基础练习
 */
public class HelloWorlld {
    public static void main(String[] args) {
        System.out.println("hello world");
        //switchMethod("日");
        //whileMethod();
        //sum();
        //forMehtod();
        //breakMethod();
        //continueMethod();
        //manyFor();
        HelloWorlld helloWorlld = new HelloWorlld();
        //helloWorlld.manyFor2();
        scoreMethod();


    }

    //if 后小括号里必须是一个条件表达式，结果为布尔值，如果为 true ，则执行后面大括号中的代码，如果为 false ，则不执行
    /**
     * java基础练习之  if 语句
     */

    public void ifMethod(){
        int a=20;
        if (a%2==0){
            System.out.println(a+"是偶数");
        }
    }

    /**
     * java基础之 if..else 语句
     */

    public void ifElseMethod(){
        int age=19;
        if (age<=18){
            System.out.println("未成年");
        }else {
            System.out.println("已成年");
        }
    }

    /**
     * java基础之 多重 if语句
     */

    public void manyIfMethod(){
        int age=30;
        if (age<=18){
            System.out.println("未成年");
        }else if (18<age&&age<30){
            System.out.println("青年");
        }else if (30<=age&&age<60){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }

    /**
     * 嵌套if 语句
     */

    public void insertIf(){
        String day="周日";
        String weather="晴朗";
        if (day.equals("周日")){
            if (weather.equals("晴朗")){
                System.out.println("go to shopping");
            }else {
                System.out.println("在家撸代码");
            }
        }else {
            System.out.println("working");
        }
    }

    //条件语句之switch
    public  static void switchMethod(String today){
        switch (today){
            case "一":
            case "三":
            case "五":
                System.out.println("吃包子");
                break;
            case "二":
            case "四":
            case "六":
                System.out.println("吃油条");
                break;
                default:
                    System.out.println("满汉全席");
        }
    }

    //while循环
    public static void whileMethod(){
        int i=0;
        while (i<=5){
            System.out.println("好好努力，每天敲代码");
            i++;
        }
    }

    //计算 50 以内（包括 50 ）的偶数之和
    public static void sum(){
        int sum=0;
        int i=0;
        while (i<=50){
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
    }
    //计算 50 以内（包括 50 ）的偶数之和
    public void sum2(){
        int sum=0;
        int i=0;
        do {
            sum=sum+i;
            i=i+2;
        }while (i<=50);
        System.out.println(sum);
    }


    //计算 1 到 100 之间不能被 3 整除的数之和
    public static void forMehtod(){
        int sum=0;
        for (int i=0;i<=100;i++){
            if (i%3!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    //使用循环输出 1--10的数值，其中，如果数值大于 2 ，并且为 3 的倍数则停止输出。  break
    public static void breakMethod(){
        for (int i = 1; i <10 ; i++) {
            if (i>2&&i%3==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("停止");
    }

    //打印 1--10 之间所有的偶数，使用 continue 语句实现代码
    public static void continueMethod(){
        for (int i = 1; i <10 ; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("结束了");
    }

    //使用 * 打印长方形,长8，宽3
    public static void manyFor(){
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //使用 * 打印直角三角形。第一行一个，第二行2个，四行（当打印每行信息时，内层循环变量的最大值和外层循环变量的值相等。）
    public void manyFor2(){
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
    public static void scoreMethod(){
        int score=53;
        int count=0;
        System.out.println("加分前成绩为"+score);
        if (score<60){
           for (;score<60;score++)
            count++;
        }
        System.out.println("加分后成绩为"+score);
        System.out.println("增加了"+count+"次");
    }


}
