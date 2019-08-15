package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.WarehouseRegion;
@Mapper
public interface WarehouseRegionMapper {
    int deleteByPrimaryKey(String warehouseRegionId);

    int insert(WarehouseRegion record);

    int insertSelective(WarehouseRegion record);

    WarehouseRegion selectByPrimaryKey(String warehouseRegionId);

    int updateByPrimaryKeySelective(WarehouseRegion record);

    int updateByPrimaryKey(WarehouseRegion record);
}