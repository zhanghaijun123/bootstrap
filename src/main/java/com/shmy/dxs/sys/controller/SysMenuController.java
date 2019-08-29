package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysMenuQuery;
import com.shmy.dxs.sys.service.SysMenuService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysMenu")
public class SysMenuController extends GenericController<SysMenu, SysMenuQuery> {
	@Inject
	private SysMenuService sysMenuService;
	@Override
	protected GenericService<SysMenu, SysMenuQuery> getService() {
		return sysMenuService;
	}
}