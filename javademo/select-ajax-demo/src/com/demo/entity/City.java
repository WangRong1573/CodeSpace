package com.demo.entity;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/3/14
 **/

public class City {
    private Integer id;
    private String name;
    private Integer provinceid;

    public City() {
    }

    public City(Integer id, String name, Integer provinceid) {
        this.id = id;
        this.name = name;
        this.provinceid = provinceid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }
}
