package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.WarehouserType;
@Mapper
public interface WarehouserTypeMapper {
    int deleteByPrimaryKey(Integer warehouserTypeId);

    int insert(WarehouserType record);

    int insertSelective(WarehouserType record);

    WarehouserType selectByPrimaryKey(Integer warehouserTypeId);

    int updateByPrimaryKeySelective(WarehouserType record);

    int updateByPrimaryKey(WarehouserType record);
}