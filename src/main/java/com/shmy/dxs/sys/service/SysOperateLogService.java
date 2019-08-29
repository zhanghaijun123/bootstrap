package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysOperateLog;
import com.shmy.dxs.sys.entity.SysOperateLogQuery;
import com.shmy.dxs.sys.dao.SysOperateLogDao;

/**
 *@author zhanghj
 **/
@Service("sysOperateLogService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysOperateLogService extends GenericService<SysOperateLog, SysOperateLogQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysOperateLogDao sysOperateLogDao;
	@Override
	protected GenericDao<SysOperateLog, SysOperateLogQuery> getDao() {
		return sysOperateLogDao;
	}
}