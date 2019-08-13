package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Warehouse;
@Mapper
public interface WarehouseMapper {
    int deleteByPrimaryKey(String warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(String warehouseId);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}