package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.TakeGoods;
@Mapper
public interface TakeGoodsMapper {
    int deleteByPrimaryKey(String takeGoodsId);

    int insert(TakeGoods record);

    int insertSelective(TakeGoods record);

    TakeGoods selectByPrimaryKey(String takeGoodsId);

    int updateByPrimaryKeySelective(TakeGoods record);

    int updateByPrimaryKey(TakeGoods record);
}