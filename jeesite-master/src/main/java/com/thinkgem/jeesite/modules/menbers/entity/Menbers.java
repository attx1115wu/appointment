/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * menbersEntity
 * @author menbers
 * @version 2018-08-17
 */
public class Menbers extends DataEntity<Menbers> {
	
	private static final long serialVersionUID = 1L;
	private String memId;		// 会员id
	private String name;		// 会员名
	private String recNum;		// 当前已预约个数
	private String tel;		// 手机号
	private String age;		// 年龄
	private String sex;		// sex
	private String email;		// email
	private String status;		// 会员状态：1是正常，2是禁止预约
	private String isdelete;		// 删除标识：1正常2删除
	
	public Menbers() {
		super();
	}

	public Menbers(String id){
		super(id);
	}

	@Length(min=1, max=11, message="会员id长度必须介于 1 和 11 之间")
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	@Length(min=0, max=255, message="会员名长度必须介于 0 和 255 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=11, message="当前已预约个数长度必须介于 0 和 11 之间")
	public String getRecNum() {
		return recNum;
	}

	public void setRecNum(String recNum) {
		this.recNum = recNum;
	}
	
	@Length(min=0, max=255, message="手机号长度必须介于 0 和 255 之间")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Length(min=0, max=11, message="年龄长度必须介于 0 和 11 之间")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Length(min=0, max=255, message="sex长度必须介于 0 和 255 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=255, message="email长度必须介于 0 和 255 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=11, message="会员状态：1是正常，2是禁止预约长度必须介于 0 和 11 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=11, message="删除标识：1正常2删除长度必须介于 0 和 11 之间")
	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}
	
}