package com.shmy.dxs.sys.entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@author zhanghj
 **/
public class SysMenu implements Comparable<SysMenu>{
	//id 
	private long id;
	//父级名称 
	private String parentName;
	//父级编号 
	private int parentId;
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
	private byte menuFloor;
	//创建者 
	private String createBy;
	//创建日期 
	private Date createDate;
	//菜单所属终端 0 手机菜单 1 电脑菜单 
	private boolean menuTerminal;
	//菜单类型(0菜单 1按钮) 
	private boolean menuType;
	//权限标识 
	private String permission;
	//排序(升序) 
	private int sorted;
	//删除标记(0删除  1正常) 
	private boolean delFlag;
	//是否给按钮添加到路由  0不添加  1添加 
	private boolean isAddrouter;
	// 父菜单信息
	private SysMenu tree;
	// 子菜单节点信息
	private List<SysMenu> child = new ArrayList<SysMenu>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
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

	public byte getMenuFloor() {
		return menuFloor;
	}

	public void setMenuFloor(byte menuFloor) {
		this.menuFloor = menuFloor;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean getMenuTerminal() {
		return menuTerminal;
	}

	public void setMenuTerminal(boolean menuTerminal) {
		this.menuTerminal = menuTerminal;
	}

	public boolean getMenuType() {
		return menuType;
	}

	public void setMenuType(boolean menuType) {
		this.menuType = menuType;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public int getSorted() {
		return sorted;
	}

	public void setSorted(int sorted) {
		this.sorted = sorted;
	}

	public boolean getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

	public boolean getIsAddrouter() {
		return isAddrouter;
	}

	public void setIsAddrouter(boolean isAddrouter) {
		this.isAddrouter = isAddrouter;
	}

	public SysMenu getTree() {
		return tree;
	}

	public void setTree(SysMenu tree) {
		this.tree = tree;
	}

	public List<SysMenu> getChild() {
		return child;
	}

	public void setChild(List<SysMenu> child) {
		this.child = child;
	}

	@Override
	public int compareTo(SysMenu o) {
		long i = this.getSorted() - o.getSorted();
		return Integer.parseInt(i+"");
	}
}
