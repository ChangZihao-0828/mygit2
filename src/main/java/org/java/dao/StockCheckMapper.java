package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.StockCheck;

import java.util.List;

@Mapper
public interface StockCheckMapper {
    int deleteByPrimaryKey(String stockCheckId);

    int insert(StockCheck record);

    int insertSelective(StockCheck record);

    StockCheck selectByPrimaryKey(String stockCheckId);

    int updateByPrimaryKeySelective(StockCheck record);

    int updateByPrimaryKey(StockCheck record);

    List<StockCheck> findStockCheck();

    Integer findStockCheckCount();
}