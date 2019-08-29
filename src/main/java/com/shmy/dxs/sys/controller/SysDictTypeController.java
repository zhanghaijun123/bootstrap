package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysDictType;
import com.shmy.dxs.sys.entity.SysDictTypeQuery;
import com.shmy.dxs.sys.service.SysDictTypeService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysDictType")
public class SysDictTypeController extends GenericController<SysDictType, SysDictTypeQuery> {
	@Inject
	private SysDictTypeService sysDictTypeService;
	@Override
	protected GenericService<SysDictType, SysDictTypeQuery> getService() {
		return sysDictTypeService;
	}
}