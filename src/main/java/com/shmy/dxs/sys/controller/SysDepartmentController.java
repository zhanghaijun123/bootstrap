package com.shmy.dxs.sys.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;

import com.shmy.dxs.sys.entity.SysDepartment;
import com.shmy.dxs.sys.entity.SysDepartmentQuery;
import com.shmy.dxs.sys.service.SysDepartmentService;

/**
 *@author zhanghj
 **/
@Controller
@RequestMapping("/sysDepartment")
public class SysDepartmentController extends GenericController<SysDepartment, SysDepartmentQuery> {
	@Inject
	private SysDepartmentService sysDepartmentService;
	@Override
	protected GenericService<SysDepartment, SysDepartmentQuery> getService() {
		return sysDepartmentService;
	}
}