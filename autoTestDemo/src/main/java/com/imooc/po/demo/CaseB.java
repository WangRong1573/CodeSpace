package com.imooc.po.demo;

/**
 * @author rong.wang
 * @date 21:28  2020/2/26
 */
public class CaseB {
    public DriverBase initDriver(String brower){
        return new DriverBase(brower);
    }
}
