package com.java.test.car.project;

public class Bus extends Car {
    //座位数
    private int num;

    public Bus() {
    }

    public Bus(String brand, double dayRent, String idCard, int num) {
        super(brand, dayRent, idCard);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double playRent(int days) {
        double money=0;
        if (days>=3&&days<7){
            money=days*0.9;
        }else if (7<=days&&days<30){
            money=days*0.8;
        }else if (30<=days&&days<150){
            money=days*0.7;
        }else if (150<=days){
            money=days*0.6;
        }else {
            money=days;
        }
        return money;
    }
}
