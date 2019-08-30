package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysRoleMenuQuery extends QueryBase {
	//id 
	private long id;
	//角色编号 
	private long roleId;
	//菜单编号 
	private long menuId;
	//全选标识(0 半选 1全选） 
	private String checkedStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getCheckedStatus() {
		return checkedStatus;
	}

	public void setCheckedStatus(String checkedStatus) {
		this.checkedStatus = checkedStatus;
	}
}
