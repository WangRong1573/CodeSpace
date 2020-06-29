package com.bilibili.demo.抽象类;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:抽象类：
 *        类和类之间具有共同的特征，将这些共同特征提取出来，形成的可就是抽象类；
 *
 * 	类到对象是实例化，对象到类是抽象
 *
 * 	类本身是不存在的，所有抽象类无法被实例化；
 *
 * 2.抽象类属于什么类型
 * 	抽象类也属于引用数据类型
 *
 * 3.抽象类语法：
 *    {修饰符列表}  abstract class 类名{
 * 		类体；
 *    }
 *
 * 	抽象类无法实例化，无法创建对象，所以抽象类天生就是用来被子类继承的；
 *
 * 	抽象类不能喝final一起使用，因为final修饰的类无法被继承
 *
 * @Author rong.wang
 * @Date 2020/6/29
 **/

public class AbstractTest01 {
    public static void main(String[] args) {

    }
}

abstract class Account{

}
/*抽象类不可被final修饰*/
/*final abstract class Account{}*/

/*抽象类的子类可以是抽象类*/
abstract class Card extends Account{ }

//编译报错，因为new子类对象时，会调用父类的无参构造方法，即有个super()，而父类声明了有参的构造方法，系统就不会再默认添加无参的构造方法了
/*abstract class Account1{
    public Account1(String s){

    }
}

class card1 extends Account1{

}*/

/*抽象类关联到抽象方法的概念：
    抽象方法表示满意方法体，没有实现的方法；*/

/*抽象方法特点：
    没有方法体，以分号结尾
    前面修饰符列表中有abstract关键字
    抽象类中可以没有抽象方法
    抽象类中可以有非抽象方法
    有抽象方法的类一定是抽象类*/

abstract class Account2{

    public abstract void doSome();

    public void doOther(){

    }
}

class Card2 extends Account2{

    @Override
    public void doSome() {
        System.out.println("重写父类方法");
    }
}
