package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Matter;
@Mapper
public interface MatterMapper {
    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    Matter selectByPrimaryKey(String matterId);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
}