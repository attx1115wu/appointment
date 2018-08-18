/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.groups.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * groupsEntity
 * @author groups
 * @version 2018-08-17
 */
public class Groups extends DataEntity<Groups> {
	
	private static final long serialVersionUID = 1L;
	private String groId;		// 批次id
	private String proId;		// 项目id
	private String number;		// 批数：整数型，从1开始递增
	
	public Groups() {
		super();
	}

	public Groups(String id){
		super(id);
	}

	@Length(min=0, max=11, message="批次id长度必须介于 0 和 11 之间")
	public String getGroId() {
		return groId;
	}

	public void setGroId(String groId) {
		this.groId = groId;
	}
	
	@Length(min=0, max=11, message="项目id长度必须介于 0 和 11 之间")
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}
	
	@Length(min=0, max=11, message="批数：整数型，从1开始递增长度必须介于 0 和 11 之间")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}