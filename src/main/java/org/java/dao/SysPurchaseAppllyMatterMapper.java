package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysPurchaseAppllyMatter;
@Mapper
public interface SysPurchaseAppllyMatterMapper {
    int deleteByPrimaryKey(Integer sysPurchaseAppllyMatterId);

    int insert(SysPurchaseAppllyMatter record);

    int insertSelective(SysPurchaseAppllyMatter record);

    SysPurchaseAppllyMatter selectByPrimaryKey(Integer sysPurchaseAppllyMatterId);

    int updateByPrimaryKeySelective(SysPurchaseAppllyMatter record);

    int updateByPrimaryKey(SysPurchaseAppllyMatter record);
}