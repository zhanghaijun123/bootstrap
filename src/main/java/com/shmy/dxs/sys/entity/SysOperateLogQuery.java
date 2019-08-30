package com.shmy.dxs.sys.entity;

import com.shmy.dxs.common.base.entity.QueryBase;

/**
 *@author zhanghj
 **/
public class SysOperateLogQuery extends QueryBase {
	//id 
	private long id;
	//操作人主键 
	private String userId;
	//操作类型 
	private String operateType;
	//操作模块 
	private String module;
	//内容 
	private String content;
	//操作人ip 
	private String ip;
	//操作对象主键 
	private String objPk;
	//创建时间 
	private String operateDate;
	//操作结果 
	private String result;
	//删除标记(0删除  1正常) 
	private String delFlag;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getObjPk() {
		return objPk;
	}

	public void setObjPk(String objPk) {
		this.objPk = objPk;
	}

	public String getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}
