package com.shmy.dxs.sys.entity;
import java.util.Date;

/**
 *@author zhanghj
 **/
public class SysDepartment {
	//id 
	private long id;
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
	private Date createDate;
	//更新者 
	private String updateBy;
	private Date updateDate;
	//删除标记(0删除  1正常) 
	private boolean delFlag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public boolean getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

}
