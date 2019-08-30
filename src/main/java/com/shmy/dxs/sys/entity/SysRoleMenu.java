package com.shmy.dxs.sys.entity;

/**
 *@author zhanghj
 **/
public class SysRoleMenu {
	//id 
	private long id;
	//角色编号 
	private long roleId;
	//菜单编号 
	private long menuId;
	//全选标识(0 半选 1全选） 
	private boolean checkedStatus;

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

	public boolean isCheckedStatus() {
		return checkedStatus;
	}

	public void setCheckedStatus(boolean checkedStatus) {
		this.checkedStatus = checkedStatus;
	}
}
