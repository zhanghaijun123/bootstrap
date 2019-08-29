package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysDictData;
import com.shmy.dxs.sys.entity.SysDictDataQuery;
import com.shmy.dxs.sys.dao.SysDictDataDao;

/**
 *@author zhanghj
 **/
@Service("sysDictDataService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysDictDataService extends GenericService<SysDictData, SysDictDataQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysDictDataDao sysDictDataDao;
	@Override
	protected GenericDao<SysDictData, SysDictDataQuery> getDao() {
		return sysDictDataDao;
	}
}