package com.imooc.cases;

import com.imooc.business.Operate;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/4/2
 **/

public class TestAddShoppingCar {
    @BeforeTest
    public void beforeTest(){
        System.out.println("加入购物车");
    }

    @Test
    public void testAddShoppingCar(){
        new Operate().addShoppingCar();
    }
}
