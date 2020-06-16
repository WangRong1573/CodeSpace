package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/16
 **/

//演奏者演奏不同的乐器发出不同声音的测试类
public class Test5 {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(new SuoNa());
    }
}
