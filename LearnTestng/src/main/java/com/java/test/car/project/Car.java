package com.java.test.car.project;

public abstract class Car {
    //品牌
    private String brand;
    //日租金
    private double dayRent;
    //车牌号
    private String idCard;

    public Car() {
    }

    public Car(String brand, double dayRent, String idCard) {
        this.brand = brand;
        this.dayRent = dayRent;
        this.idCard = idCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDayRent() {
        return dayRent;
    }

    public void setDayRent(double dayRent) {
        this.dayRent = dayRent;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    //根据天数计算折扣
    public abstract double playRent(int days);
}
