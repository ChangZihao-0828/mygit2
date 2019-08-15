package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.Vocation;
@Mapper
public interface VocationMapper {
    int deleteByPrimaryKey(Integer vocationId);

    int insert(Vocation record);

    int insertSelective(Vocation record);

    Vocation selectByPrimaryKey(Integer vocationId);

    int updateByPrimaryKeySelective(Vocation record);

    int updateByPrimaryKey(Vocation record);
}