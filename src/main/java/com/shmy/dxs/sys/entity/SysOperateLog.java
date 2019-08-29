package com.shmy.dxs.sys.entity;
import java.util.Date;

/**
 *@author zhanghj
 **/
public class SysOperateLog {
	//id 
	private String id;
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
	private Date operateDate;
	//操作结果 
	private String result;
	//删除标记(0删除  1正常) 
	private boolean delFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Date getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}

}
