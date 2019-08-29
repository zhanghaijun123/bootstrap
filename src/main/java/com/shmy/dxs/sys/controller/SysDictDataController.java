package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysDictData;
import com.shmy.dxs.sys.entity.SysDictDataQuery;
import com.shmy.dxs.sys.service.SysDictDataService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysDictData")
public class SysDictDataController extends GenericController<SysDictData, SysDictDataQuery> {
	@Inject
	private SysDictDataService sysDictDataService;
	@Override
	protected GenericService<SysDictData, SysDictDataQuery> getService() {
		return sysDictDataService;
	}
}