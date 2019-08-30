package com.shmy.dxs.common.util.user;

import com.shmy.dxs.common.util.node.NodeUtil;
import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysUser;
import com.shmy.dxs.sys.service.SysMenuService;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Author: zhanghj
 * @Date: 2019/8/30 13:37
 * @Version: 1.0
 */
public class UserInfo {
    /**
     * 功能描述：加载菜单节点的数据
     * @return
     */
    public static List<SysMenu> loadUserTree(SysMenuService sysMenuService){
        Map<Long,SysMenu> treeMap = new HashMap<Long,SysMenu>();
        SysUser user = getUser();
        for(SysMenu tree:sysMenuService.loadUserTree(user)){
            treeMap.put(tree.getId(),tree);
        }
        List<SysMenu> treeList = NodeUtil.getChildNodes(new ArrayList<SysMenu>(treeMap.values()),0l);
        return treeList;
    }

    /**
     * 功能描述：实现对密码进行MD5加密
     * @param password
     * @return
     */
    public static String encode(String password){
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(password, "dxs");
    }

    /**
     * 功能描述：获取当前登陆的用户的信息
     * 注释：强转一个null对象不会产生报错
     * @return
     */
    public static SysUser getUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        return (SysUser) Optional.ofNullable(securityContextImpl.getAuthentication().getPrincipal()).orElse(null);
    }

    /**
     * 功能描述：获取当前登陆的用户的权限集合
     * @return
     */
    public static List<GrantedAuthority> getGrantedAuthority(){
        return (List<GrantedAuthority>)Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getAuthorities()).orElse(new ArrayList<>());
    }

    /**
     * 功能描述：判断当前的用户是否包含某一个权限
     * @param authority
     * 注释：
     *      allMatch：Stream 中全部元素符合传入的 predicate，返回 true
     *      anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
     *      noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
     * @return
     */
    public static boolean hasAuthority(String authority){
        return getGrantedAuthority().stream().anyMatch(obj->obj.getAuthority().equalsIgnoreCase(authority));
    }
}
