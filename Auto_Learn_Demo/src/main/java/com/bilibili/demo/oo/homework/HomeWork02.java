package com.bilibili.demo.oo.homework;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:面向对象学习，学习使用内存图方式了解程序运行,简单封装
 * @Author rong.wang
 * @Date 2020/6/8
 **/

public class HomeWork02 {
    public static void main(String[] args) {

        Book book = new Book("java基础", 201);
        book.detail();

    }
}

class Book{

    private String name;

    private int pageNum;

    public Book() {
    }

    public Book(String name, int pageNum) {
        this.name = name;
        if (pageNum<200){
            System.out.println("页数需大于等于200，由于你输入小于200，默认为您选择为默认值：200");
            this.pageNum=200;
            return;
        }else {
            this.pageNum = pageNum;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    //书本详细信息
    public void detail(){
        System.out.println("书名："+name+"\t页数："+pageNum);
    }
}
