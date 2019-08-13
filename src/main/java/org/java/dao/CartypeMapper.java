package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Cartype;
@Mapper
public interface CartypeMapper {
    int deleteByPrimaryKey(Integer cartypeId);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    Cartype selectByPrimaryKey(Integer cartypeId);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}