package com.bilibili.demo.array;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:数组的拷贝
 * 原理：新建一个大容量的数组，将源数组数据copy一份放在大容量数组中
 * 数组的扩容因为涉及到拷贝问题，所以效率很低，尽可能少的进行数组的拷贝
 * 解决办法：创建对象的时候预估多少长度合适，预估准确，减少数组扩容次数，提高效率
 * 调用方法：System.arrayCopy();
 * @Author rong.wang
 * @Date 2020/7/21
 **/
    /** @param      src      the source array.源
    * @param      srcPos   starting position in the source array.源的起点
    * @param      dest     the destination array.目标
    * @param      destPos  starting position in the destination data.目标起点
    * @param      length   the number of array elements to be copied.长度
    * */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] a={1,11,22,3,4};
        int[] dest = new int[20];
        //容易出现数组下标越界异常
        System.arraycopy(a,1,dest,3,2);
        for (int i = 0; i <dest.length ; i++) {
            System.out.println(dest[i]);
        }
    }
}
