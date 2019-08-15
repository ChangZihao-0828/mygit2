package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysRolePermission;
@Mapper
public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Integer sysRolePermissionId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Integer sysRolePermissionId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}