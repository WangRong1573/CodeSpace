package com.bilibili.demo.抽象类;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:接口
 *
 * 类和类之间叫做继承
 * 类和接口之间叫做实现,实现使用关键字：implements
 * 实现接口的类如果是非抽象类，必须实现接口的所有方法
 *接口中所有的方法都是public的，是供实现接口的类实现的
 *
 * @Author rong.wang
 * @Date 2020/6/30
 **/

public class InterfaceTest01 {
    public static void main(String[] args) {

    }
}
/*接口中只有常量和抽象方法
*
* 接口的定义：
* 接口是完全抽象的；语法为：public interface 接口名{}，接口也是一个类，是引用类型；
* 常量修饰会默认语法为：public static final double PI=3.14; 此时的public static final可以省略
*
* 抽象方法：public abstract void doSome();此时的public abstract可以省略
*
* */
interface A{
    double PI=3.1415;
    void doSome();
    int sum(int a,int b);
}
//未实现接口的方法时报错：Error:(37, 1) java: com.bilibili.demo.抽象类.B不是抽象的, 并且未覆盖com.bilibili.demo.抽象类.A中的抽象方法sum(int,int)
class B implements A{

    /*Error:(40, 10) java: com.bilibili.demo.抽象类.B中的doSome()无法实现com.bilibili.demo.抽象类.A中的doSome()
  正在尝试分配更低的访问权限; 以前为public
    void doSome() {
    }
    */

    @Override
    public void doSome() {

    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
