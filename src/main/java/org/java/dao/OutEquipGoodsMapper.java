package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.OutEquipGoods;
@Mapper
public interface OutEquipGoodsMapper {
    int deleteByPrimaryKey(String outEquipGoodsId);

    int insert(OutEquipGoods record);

    int insertSelective(OutEquipGoods record);

    OutEquipGoods selectByPrimaryKey(String outEquipGoodsId);

    int updateByPrimaryKeySelective(OutEquipGoods record);

    int updateByPrimaryKey(OutEquipGoods record);
}