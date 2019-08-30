package com.shmy.dxs.sys.controller;

import com.shmy.dxs.common.base.constant.SystemStaticConst;
import com.shmy.dxs.common.base.controller.GenericController;
import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.util.user.UserInfo;
import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysQueryUser;
import com.shmy.dxs.sys.entity.SysUser;
import com.shmy.dxs.sys.service.SysMenuService;
import com.shmy.dxs.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
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
    @Inject
    private SysMenuService sysMenuService;
    @Override
    protected GenericService<SysUser, SysQueryUser> getService() {
        return userService;
    }
    /**
     * 功能描述：加载首页菜单节点的数据
     * @return
     */
    @RequestMapping(value="/mainTree",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String,Object> mainTree(){
        Map<String,Object> result = new HashMap<String, Object>();
        List<SysMenu> trees = UserInfo.loadUserTree(sysMenuService);
        result.put("data",trees);
        result.put(SystemStaticConst.RESULT, SystemStaticConst.SUCCESS);
        return result;
    }
}
