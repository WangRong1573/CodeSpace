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

    //选品牌
    public String chooseCar(int num){
        String brand=null;
        int brandId;
        int num1=(num==1?1:2);
        if (num1==1){
            System.out.println("请选择品牌： 1.宝马\t2.别克");
            brandId=input.nextInt();
            brand=(brandId==1?"宝马":"别克");
        }else {
            System.out.println("请选择品牌： 1.金杯\t2.金龙");
            brandId=input.nextInt();
            brand=(brandId==1?"金杯":"金龙");
        }
        return brand;
    }

    //选型号
    public String chooseType(String brand){
        int typeId;
        String type=null;
        if ("宝马".equals(brand)||"别克".equals(brand)){
            if ("宝马".equals(brand)){
                System.out.println("请选择你要订的型号： 1.X6\t2.550i");
                typeId=input.nextInt();
                type=(typeId==1?"x6":"550i");
            }else {
                System.out.println("请选择你要订的型号： 1.林荫大道\t2.GL8");
                typeId=input.nextInt();
                type=(typeId==1?"林荫大道":"GL8");
            }
        }else {
            type=null;
        }
        return type;
    }

    //选座位数
    public int chooseNum(String brand){
        int typeId;
        int num=-1;
        if ("宝马".equals(brand)||"别克".equals(brand)){
            num=0;
        }else {
            if ("金杯".equals(brand)){
                System.out.println("请选择你要订的座位数： 1.16\t2.34");
                typeId=input.nextInt();
                num=(typeId==1?16:34);
            }else {
                System.out.println("请选择你要订的座位数： 1.16\t2.34");
                typeId=input.nextInt();
                num=(typeId==1?16:34);
            }
        }
        return num;
    }

}
