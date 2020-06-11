package com.bilibili.demo.继承;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:继承的经典例子
 * 1.注意：构造方法不能继承
 * @Author rong.wang
 * @Date 2020/6/11
 **/

public class OverrideTest02 {
    public static void main(String[] args) {

        Chinese chinese = new Chinese("张三");
        chinese.speak();

        America america = new America("Jack");
        america.speak();
    }
}

class People{

    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(name+"说话");
    }
}

class Chinese extends People{

    public Chinese(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(this.getName()+"说汉语");
    }
}


class America extends People{
    public America(String name) {
        super(name);
    }

    public void speak(){
        System.out.println(this.getName()+"说英语");
    }
}