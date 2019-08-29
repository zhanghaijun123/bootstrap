package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysRoleMenu;
import com.shmy.dxs.sys.entity.SysRoleMenuQuery;
import com.shmy.dxs.sys.dao.SysRoleMenuDao;

/**
 *@author zhanghj
 **/
@Service("sysRoleMenuService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysRoleMenuService extends GenericService<SysRoleMenu, SysRoleMenuQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysRoleMenuDao sysRoleMenuDao;
	@Override
	protected GenericDao<SysRoleMenu, SysRoleMenuQuery> getDao() {
		return sysRoleMenuDao;
	}
}