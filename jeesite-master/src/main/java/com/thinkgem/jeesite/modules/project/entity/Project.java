/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.project.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * projectEntity
 * @author project
 * @version 2018-08-17
 */
public class Project extends DataEntity<Project> {
	
	private static final long serialVersionUID = 1L;
	private String proId;		// 项目id
	private String name;		// 项目名
	private Date startTime;		// 开始时间，精确到时
	private Date endTime;		// 结束时间，精确到时
	private String administrator;		// 项目控制员：用户表id
	private String groupNum;		// 项目每批人数
	private String allGroup;		// 批数上线
	private String groupData;		// 每批时间--每批用时，以分钟位单位
	private String status;		// 项目状态：1正常2暂停3停止
	private String isdelete;		// 删除：1正常  2删除
	private String address;		// 项目地址
	private String featuress;		// 项目特色
	private String url;		// 项目图片
	
	public Project() {
		super();
	}

	public Project(String id){
		super(id);
	}

	@Length(min=1, max=11, message="项目id长度必须介于 1 和 11 之间")
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}
	
	@Length(min=1, max=255, message="项目名长度必须介于 1 和 255 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	@Length(min=0, max=255, message="项目控制员：用户表id长度必须介于 0 和 255 之间")
	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	
	@Length(min=0, max=11, message="项目每批人数长度必须介于 0 和 11 之间")
	public String getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	
	@Length(min=0, max=255, message="批数上线长度必须介于 0 和 255 之间")
	public String getAllGroup() {
		return allGroup;
	}

	public void setAllGroup(String allGroup) {
		this.allGroup = allGroup;
	}
	
	@Length(min=0, max=255, message="每批时间--每批用时，以分钟位单位长度必须介于 0 和 255 之间")
	public String getGroupData() {
		return groupData;
	}

	public void setGroupData(String groupData) {
		this.groupData = groupData;
	}
	
	@Length(min=0, max=11, message="项目状态：1正常2暂停3停止长度必须介于 0 和 11 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=255, message="删除：1正常  2删除长度必须介于 0 和 255 之间")
	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	
	@Length(min=0, max=255, message="项目地址长度必须介于 0 和 255 之间")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Length(min=0, max=255, message="项目特色长度必须介于 0 和 255 之间")
	public String getFeaturess() {
		return featuress;
	}

	public void setFeaturess(String featuress) {
		this.featuress = featuress;
	}
	
	@Length(min=0, max=500, message="项目图片长度必须介于 0 和 500 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}