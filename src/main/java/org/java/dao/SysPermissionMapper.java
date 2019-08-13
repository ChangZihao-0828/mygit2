package org.java.dao;

import org.apache.ibatis.annotations.Mapper;
import org.java.entity.SysPermission;
@Mapper
public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}