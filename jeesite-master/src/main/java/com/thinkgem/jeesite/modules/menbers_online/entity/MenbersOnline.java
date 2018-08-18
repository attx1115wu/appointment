/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers_online.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * menbers_onlineEntity
 * @author menbers_online
 * @version 2018-08-17
 */
public class MenbersOnline extends DataEntity<MenbersOnline> {
	
	private static final long serialVersionUID = 1L;
	private String memId;		// 会员id
	private String proId;		// 预约项目id
	private String recState;		// 预约状态：1是已预约，2是已验证，3是已取消
	private String groId;		// gro_id
	
	public MenbersOnline() {
		super();
	}

	public MenbersOnline(String id){
		super(id);
	}

	@Length(min=0, max=11, message="会员id长度必须介于 0 和 11 之间")
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	@Length(min=0, max=11, message="预约项目id长度必须介于 0 和 11 之间")
	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}
	
	@Length(min=0, max=11, message="预约状态：1是已预约，2是已验证，3是已取消长度必须介于 0 和 11 之间")
	public String getRecState() {
		return recState;
	}

	public void setRecState(String recState) {
		this.recState = recState;
	}
	
	@Length(min=0, max=11, message="gro_id长度必须介于 0 和 11 之间")
	public String getGroId() {
		return groId;
	}

	public void setGroId(String groId) {
		this.groId = groId;
	}
	
}