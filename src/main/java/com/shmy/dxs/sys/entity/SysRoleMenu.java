package com.shmy.dxs.sys.entity;

/**
 *@author zhanghj
 **/
public class SysRoleMenu {
	//id 
	private String id;
	//角色编号 
	private String roleId;
	//菜单编号 
	private String menuId;
	//全选标识(0 半选 1全选） 
	private boolean checkedStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public boolean getCheckedStatus() {
		return checkedStatus;
	}

	public void setCheckedStatus(boolean checkedStatus) {
		this.checkedStatus = checkedStatus;
	}

}
