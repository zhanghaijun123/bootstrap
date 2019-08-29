package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysConfig;
import com.shmy.dxs.sys.entity.SysConfigQuery;
import com.shmy.dxs.sys.dao.SysConfigDao;

/**
 *@author zhanghj
 **/
@Service("sysConfigService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysConfigService extends GenericService<SysConfig, SysConfigQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysConfigDao sysConfigDao;
	@Override
	protected GenericDao<SysConfig, SysConfigQuery> getDao() {
		return sysConfigDao;
	}
}