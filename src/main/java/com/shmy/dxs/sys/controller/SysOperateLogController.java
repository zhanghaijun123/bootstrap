package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysOperateLog;
import com.shmy.dxs.sys.entity.SysOperateLogQuery;
import com.shmy.dxs.sys.service.SysOperateLogService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysOperateLog")
public class SysOperateLogController extends GenericController<SysOperateLog, SysOperateLogQuery> {
	@Inject
	private SysOperateLogService sysOperateLogService;
	@Override
	protected GenericService<SysOperateLog, SysOperateLogQuery> getService() {
		return sysOperateLogService;
	}
}