package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysRoleMenu;
import com.shmy.dxs.sys.entity.SysRoleMenuQuery;
import com.shmy.dxs.sys.service.SysRoleMenuService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysRoleMenu")
public class SysRoleMenuController extends GenericController<SysRoleMenu, SysRoleMenuQuery> {
	@Inject
	private SysRoleMenuService sysRoleMenuService;
	@Override
	protected GenericService<SysRoleMenu, SysRoleMenuQuery> getService() {
		return sysRoleMenuService;
	}
}