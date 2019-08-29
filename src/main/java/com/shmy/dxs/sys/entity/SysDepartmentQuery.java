package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysDepartmentQuery extends QueryBase {
	//id 
	private String id;
	//部门名称 
	private String departmentName;
	//上级id 
	private String parentId;
	//上级部门名称 
	private String departmentUps;
	//部门负责人 
	private String departmentCharge;
	//部门代码 
	private String departmentCode;
	//创建者 
	private String createBy;
	//创建时间 
	private String createDate;
	//更新者 
	private String updateBy;
	private String updateDate;
	//删除标记(0删除  1正常) 
	private String delFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDepartmentUps() {
		return departmentUps;
	}

	public void setDepartmentUps(String departmentUps) {
		this.departmentUps = departmentUps;
	}

	public String getDepartmentCharge() {
		return departmentCharge;
	}

	public void setDepartmentCharge(String departmentCharge) {
		this.departmentCharge = departmentCharge;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
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

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}
