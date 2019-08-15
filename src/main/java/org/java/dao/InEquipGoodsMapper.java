package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.InEquipGoods;
@Mapper
public interface InEquipGoodsMapper {
    int deleteByPrimaryKey(String inEquipGoodsId);

    int insert(InEquipGoods record);

    int insertSelective(InEquipGoods record);

    InEquipGoods selectByPrimaryKey(String inEquipGoodsId);

    int updateByPrimaryKeySelective(InEquipGoods record);

    int updateByPrimaryKey(InEquipGoods record);
}