package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysMenuQuery;
import com.shmy.dxs.sys.dao.SysMenuDao;

/**
 *@author zhanghj
 **/
@Service("sysMenuService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysMenuService extends GenericService<SysMenu, SysMenuQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysMenuDao sysMenuDao;
	@Override
	protected GenericDao<SysMenu, SysMenuQuery> getDao() {
		return sysMenuDao;
	}
}