package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysCustomerOrderMatter;
@Mapper
public interface SysCustomerOrderMatterMapper {
    int deleteByPrimaryKey(Integer sysCustomerMatterId);

    int insert(SysCustomerOrderMatter record);

    int insertSelective(SysCustomerOrderMatter record);

    SysCustomerOrderMatter selectByPrimaryKey(Integer sysCustomerMatterId);

    int updateByPrimaryKeySelective(SysCustomerOrderMatter record);

    int updateByPrimaryKey(SysCustomerOrderMatter record);
}