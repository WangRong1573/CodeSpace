package com.bilibili.demo.多态;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/6/16
 **/

public class Player {
    //根据传进来不同的乐器来发出不同的声音
    public void play(YueQi yueQi){
        if (yueQi instanceof ErHu){
            //如果传进来的yueQi 是ErHu类型的引用，转成ErHu类型对象
            ErHu erHu = (ErHu) yueQi;
            erHu.makeSound();
        }else if (yueQi instanceof GangQin){
            GangQin gangQin = (GangQin) yueQi;
            gangQin.makeSound();
        }else if (yueQi instanceof SuoNa){
            SuoNa suoNa = (SuoNa) yueQi;
            suoNa.makeSound();
        }
    }
}
