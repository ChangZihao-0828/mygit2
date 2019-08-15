package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.PrepareGoods;
@Mapper
public interface PrepareGoodsMapper {
    int deleteByPrimaryKey(String prepareGoodsId);

    int insert(PrepareGoods record);

    int insertSelective(PrepareGoods record);

    PrepareGoods selectByPrimaryKey(String prepareGoodsId);

    int updateByPrimaryKeySelective(PrepareGoods record);

    int updateByPrimaryKey(PrepareGoods record);
}