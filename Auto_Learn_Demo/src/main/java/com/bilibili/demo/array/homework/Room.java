package com.bilibili.demo.array.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:酒店管理系统练习
 * @Author rong.wang
 * @Date 2020/7/22
 **/

public class Room {

    //表示房间编号
    private int no;

    //表示房间类型
    private String type;

    //表示房间状态,true表示为空闲状态
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";    //103 单人间  空闲
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || !(o instanceof Room)){
            return false;
        }

        Room room = (Room) o;
        //如果房间号相等则认为同一个房间
        return this.no == room.no;
    }
}
