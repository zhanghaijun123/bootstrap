package com.shmy.dxs.sys.entity;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 11:03
 * @Version: 1.0
 */
public class SysRole {
    private long id;
    private String name;
    private String roleName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
