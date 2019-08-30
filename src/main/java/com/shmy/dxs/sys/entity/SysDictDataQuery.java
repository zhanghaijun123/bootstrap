package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysDictDataQuery extends QueryBase {
	//id 
	private long id;
	//字典标签 
	private String dictLabel;
	//字典键值 
	private String dictValue;
	//所属字典类型 
	private String dictType;
	//字典描述 
	private String description;
	//创建者 
	private String createBy;
	//创建时间 
	private String createDate;
	//更新者 
	private String updateBy;
	//更新时间 
	private String updateDate;
	//本级排序号（升序） 
	private Byte treeSort;
	//状态（0删除 1启用  2停用） 
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDictLabel() {
		return dictLabel;
	}

	public void setDictLabel(String dictLabel) {
		this.dictLabel = dictLabel;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public String getDictType() {
		return dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Byte getTreeSort() {
		return treeSort;
	}

	public void setTreeSort(Byte treeSort) {
		this.treeSort = treeSort;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
