package com.demo.factory;

import com.demo.service.Sell;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/15
 **/

//目标类
public class KingFactory implements Sell {
    @Override
    //目标方法
    public float sell(int amount) {
        System.out.println("目标方法执行了");
        return 85;
    }
}
