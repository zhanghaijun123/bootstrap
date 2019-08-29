package com.shmy.dxs.sys.service;

import com.shmy.dxs.common.base.dao.GenericDao;
import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.sys.dao.SysUserDao;
import com.shmy.dxs.sys.entity.SysQueryUser;
import com.shmy.dxs.sys.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zhanghj
 * @Date: 2019/8/29 14:10
 * @Version: 1.0
 */
@Service("userService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class UserService extends GenericService<SysUser, SysQueryUser> {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private SysUserDao sysUserDao;
    @Override
    protected GenericDao<SysUser, SysQueryUser> getDao() {
        return sysUserDao;
    }
}
