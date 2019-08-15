package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysUserinfoRole;
@Mapper
public interface SysUserinfoRoleMapper {
    int deleteByPrimaryKey(Integer sysUserinfoRoleId);

    int insert(SysUserinfoRole record);

    int insertSelective(SysUserinfoRole record);

    SysUserinfoRole selectByPrimaryKey(Integer sysUserinfoRoleId);

    int updateByPrimaryKeySelective(SysUserinfoRole record);

    int updateByPrimaryKey(SysUserinfoRole record);
}