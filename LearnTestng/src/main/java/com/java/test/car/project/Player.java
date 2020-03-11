package com.java.test.car.project;

import java.util.Scanner;

public class Player {
    Scanner input=new Scanner(System.in);
    Car[] cars=new Car[8];

    //增加车辆信息
    public void addCar(){
        cars[0]=new SaloonCar("宝马",800,"豫Nqv583","x5");
        cars[1]=new SaloonCar("宝马",600,"豫Nqv543","550i");
        cars[2]=new SaloonCar("别克",300,"豫Nq6666","林荫大道");
        cars[3]=new SaloonCar("别克",600,"豫Qwu888","GL8");
        cars[4]=new Bus("金杯",800,"京N3467",16);
        cars[5]=new Bus("金龙",800,"京N8888",16);
        cars[6]=new Bus("金杯",1500,"京N6666",34);
        cars[7]=new Bus("金龙",1500,"京N11111",34);
    }

    //选车
    public Car findCar(String brand,String type,int num){ //品牌、型号、座位数
        if (cars!=null&&cars.length>0){
            for (Car c:cars) {
                if (c instanceof SaloonCar){
                    SaloonCar saloonCar= (SaloonCar) c;
                    if (saloonCar.getBrand().equals(brand)&&saloonCar.getType().equals(type)){
                        return saloonCar;
                    }
                }
                if (c instanceof Bus){
                    Bus bus= (Bus) c;
                    if (bus.getBrand().equals(brand)&&bus.getNum()==num){
                        return bus;
                    }
                }
            }
        }
        return null;
    }
}
