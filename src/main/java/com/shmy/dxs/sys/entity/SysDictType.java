package com.shmy.dxs.sys.entity;
import java.util.Date;

/**
 *@author zhanghj
 **/
public class SysDictType {
	//id 
	private String id;
	//字典名称 
	private String dictName;
	//字典类型 
	private String dictType;
	//是否系统字典(false=0 否  true=1是) 
	private boolean isSys;
	//创建者 
	private String createBy;
	//创建时间 
	private Date createDate;
	//更新者 
	private String updateBy;
	//更新时间 
	private Date updateDate;
	//状态(0删除   1启用   2停用 ） 
	private boolean status;

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

	public boolean getIsSys() {
		return isSys;
	}

	public void setIsSys(boolean isSys) {
		this.isSys = isSys;
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
