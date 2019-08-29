package com.shmy.dxs.sys.dao;

import com.shmy.dxs.common.base.dao.GenericDao;
import com.shmy.dxs.sys.entity.SysQueryUser;
import com.shmy.dxs.sys.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 11:14
 * @Version: 1.0
 */
@Repository
public interface SysUserDao extends GenericDao<SysUser, SysQueryUser> {
    /**
     * 根据账号查找用户
     * @param login
     * @return
     */
    SysUser findByLogin(String login);
}
