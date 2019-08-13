package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.DeliverGoods;
@Mapper
public interface DeliverGoodsMapper {
    int deleteByPrimaryKey(String deliverGoodsId);

    int insert(DeliverGoods record);

    int insertSelective(DeliverGoods record);

    DeliverGoods selectByPrimaryKey(String deliverGoodsId);

    int updateByPrimaryKeySelective(DeliverGoods record);

    int updateByPrimaryKey(DeliverGoods record);
}