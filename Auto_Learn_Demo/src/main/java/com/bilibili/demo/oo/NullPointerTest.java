package com.bilibili.demo.oo;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:学习java空指针异常
 * 1.空指针解释：对象没有引用指向它了，又因为无法直接操作堆内存中的对象，此时对象就想（放风筝时）风筝线断了，风筝飞走了是一样的
 * 等待垃圾回收器的回收，GC会将这个垃圾对象释放掉；
 * 2.java中的垃圾回收器GC主要回收的是堆内存中的垃圾数据，当没有任何引用指向该对象的时候，将会被回收
 * 3.空指针出现的情况：“空引用”访问对象实例【对象相关】的数据时，都会出现空指针异常
 * @Author rong.wang
 * @Date 2020/6/2
 **/

public class NullPointerTest {

    public static void main(String[] args) {
        Custom custom = new Custom();
        System.out.println(custom.id);

        custom.id=10086;
        System.out.println(custom.id);

        //此处演示空指针异常，既是空引用指向成员变量（实例变量）
        //NullPointerException
        custom=null;
        System.out.println(custom.id);
    }
}

class Custom{
    int id;
}
