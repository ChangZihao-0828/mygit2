package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.OutGoods;
@Mapper
public interface OutGoodsMapper {
    int deleteByPrimaryKey(String outGoodsId);

    int insert(OutGoods record);

    int insertSelective(OutGoods record);

    OutGoods selectByPrimaryKey(String outGoodsId);

    int updateByPrimaryKeySelective(OutGoods record);

    int updateByPrimaryKey(OutGoods record);
}