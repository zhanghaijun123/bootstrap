package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysDictType;
import com.shmy.dxs.sys.entity.SysDictTypeQuery;
import com.shmy.dxs.sys.dao.SysDictTypeDao;

/**
 *@author zhanghj
 **/
@Service("sysDictTypeService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysDictTypeService extends GenericService<SysDictType, SysDictTypeQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysDictTypeDao sysDictTypeDao;
	@Override
	protected GenericDao<SysDictType, SysDictTypeQuery> getDao() {
		return sysDictTypeDao;
	}
}