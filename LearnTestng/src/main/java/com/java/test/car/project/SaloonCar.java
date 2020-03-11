package com.java.test.car.project;

public class SaloonCar extends Car { //轿车
    //型号
    private String type;

    public SaloonCar() {
    }

    public SaloonCar(String brand, double dayRent, String idCard, String type) {
        super(brand, dayRent, idCard);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double playRent(int days) {

        double money=0;
        if (7<days&&days<=30){
            money=days*0.9;
        }else if (30<days&&days<=150){
            money=days*0.8;
        }else if (150<days){
            money=days*0.7;
        }else {
            money=days;
        }
        return money;
    }
}
