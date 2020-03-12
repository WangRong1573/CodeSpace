package com.java.test.car.project;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Player player = new Player();
        player.addCar();
        System.out.println("欢迎来到订车系统！");
        System.out.println("请输入你要订的车型对应编号： 1. 轿车\t2.客车");
        int brandNum=input.nextInt();   //车型
        String brand=player.chooseCar(brandNum);//品牌
        String type=player.chooseType(brand); //型号
        int num=player.chooseNum(brand);//座位数

        Car car=player.findCar(brand,type,num);
        System.out.println("请输入你要租用的天数：");
        int days=input.nextInt();
        SaloonCar saloonCar = new SaloonCar();
        System.out.println("车牌号是："+car.getIdCard());
        System.out.println("费用是"+saloonCar.playRent(days)*car.getDayRent());

    }
}
