package org.java.entity;

import java.io.Serializable;

public class SysRolePermission  implements Serializable {
    private Integer sysRolePermissionId;

    private String roleId;

    private String permissionId;

    public Integer getSysRolePermissionId() {
        return sysRolePermissionId;
    }

    public void setSysRolePermissionId(Integer sysRolePermissionId) {
        this.sysRolePermissionId = sysRolePermissionId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }
}