package org.java.entity;

import java.io.Serializable;

public class SysUserinfoRole  implements Serializable {
    private Integer sysUserinfoRoleId;

    private Integer userId;

    private Integer roleId;

    public Integer getSysUserinfoRoleId() {
        return sysUserinfoRoleId;
    }

    public void setSysUserinfoRoleId(Integer sysUserinfoRoleId) {
        this.sysUserinfoRoleId = sysUserinfoRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}