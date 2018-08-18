/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.menbers.entity.Menbers;
import com.thinkgem.jeesite.modules.menbers.dao.MenbersDao;

/**
 * menbersService
 * @author menbers
 * @version 2018-08-17
 */
@Service
@Transactional(readOnly = true)
public class MenbersService extends CrudService<MenbersDao, Menbers> {

	public Menbers get(String id) {
		return super.get(id);
	}
	
	public List<Menbers> findList(Menbers menbers) {
		return super.findList(menbers);
	}
	
	public Page<Menbers> findPage(Page<Menbers> page, Menbers menbers) {
		return super.findPage(page, menbers);
	}
	
	@Transactional(readOnly = false)
	public void save(Menbers menbers) {
		super.save(menbers);
	}
	
	@Transactional(readOnly = false)
	public void delete(Menbers menbers) {
		super.delete(menbers);
	}
	
}