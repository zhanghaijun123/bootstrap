package com.shmy.dxs.sys.entity;

/**
 *@author zhanghj
 **/
public class SysConfig {
	//id 
	private long id;
	//名称 
	private String name;
	//值(0不开启 1开启） 
	private int codeValue;
	//备注 
	private String remark;
	//类型 
	private String type;
	//排序 
	private long sorted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(int codeValue) {
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

	public long getSorted() {
		return sorted;
	}

	public void setSorted(long sorted) {
		this.sorted = sorted;
	}

}
