package com.shmy.dxs.common.config.security;

import com.shmy.dxs.sys.dao.SysUserDao;
import com.shmy.dxs.sys.entity.SysUser;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.inject.Inject;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 13:33
 * @Version: 1.0
 */
public class CustomUserService implements UserDetailsService {
    @Inject
    private SysUserDao sysUserDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserDao.findByLogin(username);
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 自定义错误的文章说明的地址：http://blog.csdn.net/z69183787/article/details/21190639?locationNum=1&fps=1
        if(user.getState().equalsIgnoreCase("0")){
            throw new LockedException("用户账号被冻结，无法登陆请联系管理员！");
        }
        return user;
    }

}
