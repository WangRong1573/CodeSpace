package com.demo.entity;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2020/9/27
 **/

public class MyStudent {

    private Integer myId;

    private String myName;

    private String myEmail;

    private Integer myAge;

    public Integer getMyId() {
        return myId;
    }

    public void setMyId(Integer myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public void setMyEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    public Integer getMyAge() {
        return myAge;
    }

    public void setMyAge(Integer myAge) {
        this.myAge = myAge;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "myId=" + myId +
                ", myName='" + myName + '\'' +
                ", myEmail='" + myEmail + '\'' +
                ", myAge=" + myAge +
                '}';
    }
}
