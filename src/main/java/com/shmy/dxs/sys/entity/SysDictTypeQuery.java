package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysDictTypeQuery extends QueryBase {
	//id 
	private String id;
	//字典名称 
	private String dictName;
	//字典类型 
	private String dictType;
	//是否系统字典(false=0 否  true=1是) 
	private String isSys;
	//创建者 
	private String createBy;
	//创建时间 
	private String createDate;
	//更新者 
	private String updateBy;
	//更新时间 
	private String updateDate;
	//状态(0删除   1启用   2停用 ） 
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public String getDictType() {
		return dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getIsSys() {
		return isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
