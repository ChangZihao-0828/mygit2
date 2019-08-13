package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.StockCheck;
@Mapper
public interface StockCheckMapper {
    int deleteByPrimaryKey(String stockCheckId);

    int insert(StockCheck record);

    int insertSelective(StockCheck record);

    StockCheck selectByPrimaryKey(String stockCheckId);

    int updateByPrimaryKeySelective(StockCheck record);

    int updateByPrimaryKey(StockCheck record);
}