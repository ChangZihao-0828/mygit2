package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.MatterCheck;
@Mapper
public interface MatterCheckMapper {
    int deleteByPrimaryKey(String matterCheckId);

    int insert(MatterCheck record);

    int insertSelective(MatterCheck record);

    MatterCheck selectByPrimaryKey(String matterCheckId);

    int updateByPrimaryKeySelective(MatterCheck record);

    int updateByPrimaryKey(MatterCheck record);
}