package com.shmy.dxs.sys.dao;

import com.shmy.dxs.sys.entity.SysUser;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 11:14
 * @Version: 1.0
 */
public interface SysUserDao {
    /**
     * 根据账号查找用户
     * @param login
     * @return
     */
    SysUser findByLogin(String login);
}
