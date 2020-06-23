package com.bilibili.demo.super学习;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:小作业练习
 * @Author rong.wang
 * @Date 2020/6/23
 **/

public class SuperTest03 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120,90);
        System.out.println(vehicle.getSpeed()+"/t"+vehicle.getSize());

        vehicle.speedUp(15);
        System.out.println(vehicle.getSpeed()+"/t"+vehicle.getSize());

        vehicle.speedDown(10);
        System.out.println(vehicle.getSpeed()+"/t"+vehicle.getSize());

    }
}

class Vehicle{

    private int speed;

    private double size;

    public Vehicle() {
    }

    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void move(){
        System.out.println("正在移动");
    }

    public void speedUp(int num){
        this.setSpeed(this.getSpeed()+num);
    }

    public void speedDown(int num){
        this.setSpeed(this.getSpeed()-num);
    }
}
