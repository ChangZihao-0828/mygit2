package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Supplier;
@Mapper
public interface SupplierMapper {
    int deleteByPrimaryKey(String supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String supplierId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}