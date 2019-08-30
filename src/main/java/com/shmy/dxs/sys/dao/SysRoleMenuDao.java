package com.shmy.dxs.sys.dao;

import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysRole;
import com.shmy.dxs.sys.entity.SysRoleMenu;
import com.shmy.dxs.sys.entity.SysRoleMenuQuery;
import org.springframework.stereotype.Repository;

/**
 *@author zhanghj
 **/
@Repository
public interface SysRoleMenuDao extends GenericDao<SysRoleMenu, SysRoleMenuQuery> {

    /**
     * 功能描述：根据菜单ID来删除关联的菜单数据
     * @param tree
     * @return
     */
    int removeTreeByTreeId(SysMenu tree);

    /**
     * 功能描述：根据角色ID来删除关联的菜单数据
     * @param sysRole
     * @return
     */
    int removeTreeByRoleId(SysRole sysRole);
	
}