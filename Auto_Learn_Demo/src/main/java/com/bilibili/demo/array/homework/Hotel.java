package com.bilibili.demo.array.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:酒店类
 * @Author rong.wang
 * @Date 2020/7/22
 **/

public class Hotel {

     private Room[][] rooms;

    public Hotel() {
        //初始化酒店楼层和每层房间数
        rooms = new Room[3][10];
        //赋值房间号和房间类型及状态
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j <rooms[i].length; j++) {
                if (i == 0){
                    //房间号101,102,201,301...
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"双人间",true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }

    //查看房间列表及状态
    public void viewRoom(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    //订房间
    public void orderRoom(int roomNo){
        //将房间状态置为false
        if (rooms[roomNo / 100 -1][roomNo %100 -1].getStatus() ==false){
            System.out.println("房间已被预订，请选择其他房间");
        }
        rooms[roomNo / 100 -1][roomNo %100 -1].setStatus(false);
    }

    //退房间
    public void existRoom(int roomNo){
        if (rooms[roomNo / 100 -1][roomNo %100 -1].getStatus() == true){
            System.out.println("未预订此房间，退房错误，请重新选择");
        }

        rooms[roomNo / 100 -1][roomNo %100 -1].setStatus(true);
    }
}
