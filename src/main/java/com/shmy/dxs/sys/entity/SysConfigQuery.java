package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysConfigQuery extends QueryBase {
	//id 
	private String id;
	//名称 
	private String name;
	//值(0不开启 1开启） 
	private Integer codeValue;
	//备注 
	private String remark;
	//类型 
	private String type;
	//排序 
	private Long sorted;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(Integer codeValue) {
		this.codeValue = codeValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSorted() {
		return sorted;
	}

	public void setSorted(Long sorted) {
		this.sorted = sorted;
	}

}
