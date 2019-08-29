package com.shmy.dxs.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysDepartment;
import com.shmy.dxs.sys.entity.SysDepartmentQuery;
import com.shmy.dxs.sys.dao.SysDepartmentDao;

/**
 *@author zhanghj
 **/
@Service("sysDepartmentService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysDepartmentService extends GenericService<SysDepartment, SysDepartmentQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysDepartmentDao sysDepartmentDao;
	@Override
	protected GenericDao<SysDepartment, SysDepartmentQuery> getDao() {
		return sysDepartmentDao;
	}
}