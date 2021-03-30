package com.bjpowernode.dao;

import com.bjpowernode.domain.Goods;

public interface GoodsDao {
    /**
     * 更新库存
     * @param goods
     * @return
     */
    int updateGoods(Goods goods);

    Goods selectGoods(Integer id);
}
