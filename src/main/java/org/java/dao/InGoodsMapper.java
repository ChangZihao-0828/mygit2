package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.InGoods;
@Mapper
public interface InGoodsMapper {
    int deleteByPrimaryKey(String inGoodsId);

    int insert(InGoods record);

    int insertSelective(InGoods record);

    InGoods selectByPrimaryKey(String inGoodsId);

    int updateByPrimaryKeySelective(InGoods record);

    int updateByPrimaryKey(InGoods record);
}