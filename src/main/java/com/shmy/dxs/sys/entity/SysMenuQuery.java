package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysMenuQuery extends QueryBase {
	//id 
	private String id;
	//父级名称 
	private String parentName;
	//父级编号 
	private String parentId;
	//菜单名称 
	private String name;
	//组件 
	private String component;
	//主标题 
	private String title;
	//链接 
	private String path;
	//目标 
	private String target;
	//图标 
	private String icon;
	//层级 
	private Byte menuFloor;
	//创建者 
	private String createBy;
	//创建日期 
	private String createDate;
	//菜单所属终端 0 手机菜单 1 电脑菜单 
	private String menuTerminal;
	//菜单类型(0菜单 1按钮) 
	private String menuType;
	//权限标识 
	private String permission;
	//排序(升序) 
	private Integer sorted;
	//删除标记(0删除  1正常) 
	private String delFlag;
	//是否给按钮添加到路由  0不添加  1添加 
	private String isAddrouter;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Byte getMenuFloor() {
		return menuFloor;
	}

	public void setMenuFloor(Byte menuFloor) {
		this.menuFloor = menuFloor;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getMenuTerminal() {
		return menuTerminal;
	}

	public void setMenuTerminal(String menuTerminal) {
		this.menuTerminal = menuTerminal;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getIsAddrouter() {
		return isAddrouter;
	}

	public void setIsAddrouter(String isAddrouter) {
		this.isAddrouter = isAddrouter;
	}

}
