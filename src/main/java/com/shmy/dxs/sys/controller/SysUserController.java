package com.shmy.dxs.sys.controller;

import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.sys.entity.SysQueryUser;
import com.shmy.dxs.sys.entity.SysUser;
import com.shmy.dxs.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhanghj
 * @Date: 2019/8/29 10:29
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class SysUserController extends GenericController<SysUser, SysQueryUser> {
    @Autowired
    private UserService userService;
    @Override
    protected GenericService<SysUser, SysQueryUser> getService() {
        return userService;
    }
}
