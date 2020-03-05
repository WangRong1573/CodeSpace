package com.java.practice;

import java.util.Arrays;

/**
 * @author rong.wang
 * @date 20:45  2020/3/5
 * java中方法的认识和练习
 */
public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        //System.out.println(methodDemo.aveAge());

        //System.out.println("数组中最大的值为"+methodDemo.test());

        //System.out.println(methodDemo.getAvg(55,60));

//        int[] scores={31,25,69,75,86};
//        int count=methodDemo.test2(scores);
//        System.out.println("共有"+count+"个元素");

//        methodDemo.print();
//        methodDemo.print("James");
//        methodDemo.print(18);

//        int[] arr=methodDemo.getNums(10);
//        System.out.println(Arrays.toString(arr));

//        int[] scores={89 , -23 , 64 , 91 , 119 , 52 , 73,100,99};
//        methodDemo.getScores(scores);



    }

    //无参有返回值方法
    public double aveAge(){
        double stuAge=18;
        double teaAge=31;
        double avgAge=(stuAge+teaAge)/2;
        return avgAge;
    }

    /**
     * * 功能：输出学生年龄的最大值
     *      * 定义一个无参的方法，返回值为年龄的最大值
     *      * 参考步骤：
     *      * 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18 ,23 ,21 ,19 ,25 ,29 ,17
     *      * 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
     *      * 3、使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值
     *      * 4、使用 return 返回最大值
     * @return
     */
    public int test(){
        int[] ages={18 ,23 ,21 ,19 ,25 ,29 ,17};
        int max=ages[0];
        for (int i = 0; i <ages.length ; i++) {
            if (max<ages[i]){
                max=ages[i];
            }
        }
        return max;
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */
    public double getAvg(double num1, double num2){
        double avg=(num1+num2)/2;
        return avg;
    }

    /*
     * 功能：将考试成绩排序并输出，返回成绩的个数
     * 定义一个包含整型数组参数的方法，传入成绩数组
     * 使用Arrays类对成绩数组进行排序并输出
     * 方法执行后返回数组中元素的个数
     */
    public int test2(int[] scores){
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        return scores.length;
    }

    /**
     * 判断方法重载的依据：
     *
     * 1、 必须是在同一个类中
     *
     * 2、 方法名相同
     *
     * 3、 方法参数的个数、顺序或类型不同
     *
     * 4、 与方法的修饰符或返回值没有关系
     */

    public void print(){
        System.out.println("无参的print方法");
    }

    public void print(String name){
        System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
    }

    public void print(int age){
        System.out.println("带有一个整型参数的print方法，参数值为：" + age);
    }

    /*
     * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
     * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
     */

    public int[] getNums(int length){
        int[] nums=new int[length];
        for (int i = 0; i <nums.length ; i++) {
            //将随机数赋值给数组中的值
            nums[i]= (int) (Math.random()*100);
        }
        return nums;
    }


    /**
     * 要求：
     *实现输出考试成绩的前三名
     * 1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73
     *
     * 2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入
     *
     * 3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
     */

    public void getScores(int[] scores){
        Arrays.sort(scores);
        int num=0;
        for (int i=scores.length-1;i>=0;i--){
            if (scores[i]<=0||scores[i]>=100){
                continue;
            }
            num++;
            if (num>3){
                break;
            }
            System.out.println(scores[i]);
        }
    }



}
