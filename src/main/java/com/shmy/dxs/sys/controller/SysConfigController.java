package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysConfig;
import com.shmy.dxs.sys.entity.SysConfigQuery;
import com.shmy.dxs.sys.service.SysConfigService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysConfig")
public class SysConfigController extends GenericController<SysConfig, SysConfigQuery> {
	@Inject
	private SysConfigService sysConfigService;
	@Override
	protected GenericService<SysConfig, SysConfigQuery> getService() {
		return sysConfigService;
	}
}