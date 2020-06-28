package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/28
 **/

public class IntanceofTest01 {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();
        player.play(new Piano());
    }
}

class MusicPlayer{
    public void play(MusicalInstruments m){

        if (m instanceof Piano){
            Piano p= (Piano) m;
            p.makeSound();
        }else if (m instanceof SuoNa1){
            SuoNa1 s= (SuoNa1) m;
            s.makeSound();
        }
    }
}

class MusicalInstruments{
    public void makeSound(){
        System.out.println("乐手演奏乐器，发出不同声音");
    }
}

class Piano extends MusicalInstruments{
    @Override
    public void makeSound() {
        System.out.println("钢琴的声音比较优雅");
    }
}

class SuoNa1 extends MusicalInstruments{
    @Override
    public void makeSound() {
        System.out.println("唢呐的声音比较的悲壮");
    }
}