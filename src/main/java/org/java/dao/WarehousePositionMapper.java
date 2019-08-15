package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.WarehousePosition;
@Mapper
public interface WarehousePositionMapper {
    int deleteByPrimaryKey(String warehousePositionId);

    int insert(WarehousePosition record);

    int insertSelective(WarehousePosition record);

    WarehousePosition selectByPrimaryKey(String warehousePositionId);

    int updateByPrimaryKeySelective(WarehousePosition record);

    int updateByPrimaryKey(WarehousePosition record);
}