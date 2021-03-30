package com.bjpowernode.service;

public interface BuyGoodsService {
    /**
     * 购买商品
     * @param goodsId 购买商品的id
     * @param nums 购买商品的数量
     */
    void buy(Integer goodsId,Integer nums);
}
