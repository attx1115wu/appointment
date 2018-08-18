/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.online.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * onlineEntity
 * @author online
 * @version 2018-08-17
 */
public class Online extends DataEntity<Online> {
	
	private static final long serialVersionUID = 1L;
	private String recMax;		// 预约上线：就一条数据，单独一条sql控制
	
	public Online() {
		super();
	}

	public Online(String id){
		super(id);
	}

	@Length(min=0, max=11, message="预约上线：就一条数据，单独一条sql控制长度必须介于 0 和 11 之间")
	public String getRecMax() {
		return recMax;
	}

	public void setRecMax(String recMax) {
		this.recMax = recMax;
	}
	
}