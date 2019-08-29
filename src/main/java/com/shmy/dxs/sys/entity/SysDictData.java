package com.shmy.dxs.sys.entity;
import java.util.Date;

/**
 *@author zhanghj
 **/
public class SysDictData {
	//id 
	private String id;
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
	private Date createDate;
	//更新者 
	private String updateBy;
	//更新时间 
	private Date updateDate;
	//本级排序号（升序） 
	private byte treeSort;
	//状态（0删除 1启用  2停用） 
	private boolean status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public byte getTreeSort() {
		return treeSort;
	}

	public void setTreeSort(byte treeSort) {
		this.treeSort = treeSort;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
