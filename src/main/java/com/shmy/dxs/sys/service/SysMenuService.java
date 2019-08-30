package com.shmy.dxs.sys.service;

import com.shmy.dxs.sys.dao.SysRoleMenuDao;
import com.shmy.dxs.sys.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.shmy.dxs.common.base.service.GenericService;
import com.shmy.dxs.common.base.dao.GenericDao;

import com.shmy.dxs.sys.entity.SysMenu;
import com.shmy.dxs.sys.entity.SysMenuQuery;
import com.shmy.dxs.sys.dao.SysMenuDao;

import java.util.List;

/**
 *@author zhanghj
 **/
@Service("sysMenuService")
@Transactional(rollbackFor={IllegalArgumentException.class})
public class SysMenuService extends GenericService<SysMenu, SysMenuQuery> {
	@Autowired
	@SuppressWarnings("SpringJavaAutowiringInspection")
	private SysMenuDao sysMenuDao;
	@Autowired
	private SysRoleMenuDao sysRoleMenuDao;
	@Override
	protected GenericDao<SysMenu, SysMenuQuery> getDao() {
		return sysMenuDao;
	}
	/**
	 * 功能描述：删除菜单的数据
	 * @param entity 删除对象
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean delete(SysMenu entity) throws Exception {
		sysRoleMenuDao.removeTreeByTreeId(entity);
		return super.delete(entity);
	}

	/**
	 * 功能描述：加载用户的菜单树的数据
	 * @param user
	 * @return
	 */
	public List<SysMenu> loadUserTree(SysUser user){
		return sysMenuDao.loadUserTree(user);
	}

}