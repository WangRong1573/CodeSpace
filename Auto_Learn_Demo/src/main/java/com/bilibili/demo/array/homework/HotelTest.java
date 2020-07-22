package com.bilibili.demo.array.homework;

import java.util.Scanner;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/7/22
 **/

public class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店系统，请选择您需要的功能：选择对应的编号即可");
        System.out.println("" +
                "1.查看所有房间状态列表" +
                "2.订房间" +
                "3.退房" +
                "4.退出系统");



        while (true){
            System.out.println("请输入功能编号：");
            Scanner scanner =new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 1){
                hotel.viewRoom();
            }else if (i == 2){
                System.out.println("请输入房间编号：");
                int roomNo= scanner.nextInt();
                hotel.orderRoom(roomNo);
                System.out.println("订房成功");
            }else if (i ==3){
                System.out.println("请输入退房房间号：");
                int roomN = scanner.nextInt();
                hotel.existRoom(roomN);
                System.out.println("退房成功");
            }else if (i == 0){
                System.out.println("欢迎下次使用");
                return;
            }else {
                System.out.println("输入有误，请重新输入");
            }
            /*switch (i){
                case 1:
                    hotel.viewRoom();
                    break;
                case 2:
                    System.out.println("请输入房间编号：");
                    int roomNo= scanner.nextInt();
                    hotel.orderRoom(roomNo);
                    System.out.println("订房成功");
                    break;
                case 3:
                    System.out.println("请输入退房房间号：");
                    int roomN = scanner.nextInt();
                    hotel.existRoom(roomN);
                    System.out.println("退房成功");
                    break;
                case 0:
                    System.out.println("欢迎下次使用");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }*/
        }
    }
}
