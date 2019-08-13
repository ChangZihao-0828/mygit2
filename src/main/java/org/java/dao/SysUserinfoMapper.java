package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysUserinfo;
@Mapper
public interface SysUserinfoMapper {
    int deleteByPrimaryKey(String userId);

    int insert(SysUserinfo record);

    int insertSelective(SysUserinfo record);

    SysUserinfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(SysUserinfo record);

    int updateByPrimaryKey(SysUserinfo record);
}