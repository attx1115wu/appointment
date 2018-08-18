/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.groups.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.groups.entity.Groups;
import com.thinkgem.jeesite.modules.groups.dao.GroupsDao;

/**
 * groupsService
 * @author groups
 * @version 2018-08-17
 */
@Service
@Transactional(readOnly = true)
public class GroupsService extends CrudService<GroupsDao, Groups> {

	public Groups get(String id) {
		return super.get(id);
	}
	
	public List<Groups> findList(Groups groups) {
		return super.findList(groups);
	}
	
	public Page<Groups> findPage(Page<Groups> page, Groups groups) {
		return super.findPage(page, groups);
	}
	
	@Transactional(readOnly = false)
	public void save(Groups groups) {
		super.save(groups);
	}
	
	@Transactional(readOnly = false)
	public void delete(Groups groups) {
		super.delete(groups);
	}
	
}