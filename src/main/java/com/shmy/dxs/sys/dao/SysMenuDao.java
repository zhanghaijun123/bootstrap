package com.shmy.dxs.sys.dao;

import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysMenuQuery;
import com.shmy.dxs.sys.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *@author zhanghj
 **/
@Repository
public interface SysMenuDao extends GenericDao<SysMenu, SysMenuQuery> {
    /**
     * 功能描述：加载用户的菜单树的数据
     * @param user
     * @return
     */
    List<SysMenu> loadUserTree(SysUser user);

	
}