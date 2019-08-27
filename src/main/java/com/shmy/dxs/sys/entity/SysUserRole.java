package com.shmy.dxs.sys.entity;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 11:03
 * @Version: 1.0
 */
public class SysUserRole {
    private int userId;
    private long roleId;

    public SysUserRole() {
        super();
    }

    public SysUserRole(int userId, long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
}
