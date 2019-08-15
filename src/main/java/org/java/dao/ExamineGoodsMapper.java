package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.ExamineGoods;
@Mapper
public interface ExamineGoodsMapper {
    int deleteByPrimaryKey(String examineGoodsId);

    int insert(ExamineGoods record);

    int insertSelective(ExamineGoods record);

    ExamineGoods selectByPrimaryKey(String examineGoodsId);

    int updateByPrimaryKeySelective(ExamineGoods record);

    int updateByPrimaryKey(ExamineGoods record);
}