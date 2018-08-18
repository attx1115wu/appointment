/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers_online.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.menbers_online.entity.MenbersOnline;
import com.thinkgem.jeesite.modules.menbers_online.dao.MenbersOnlineDao;

/**
 * menbers_onlineService
 * @author menbers_online
 * @version 2018-08-17
 */
@Service
@Transactional(readOnly = true)
public class MenbersOnlineService extends CrudService<MenbersOnlineDao, MenbersOnline> {

	public MenbersOnline get(String id) {
		return super.get(id);
	}
	
	public List<MenbersOnline> findList(MenbersOnline menbersOnline) {
		return super.findList(menbersOnline);
	}
	
	public Page<MenbersOnline> findPage(Page<MenbersOnline> page, MenbersOnline menbersOnline) {
		return super.findPage(page, menbersOnline);
	}
	
	@Transactional(readOnly = false)
	public void save(MenbersOnline menbersOnline) {
		super.save(menbersOnline);
	}
	
	@Transactional(readOnly = false)
	public void delete(MenbersOnline menbersOnline) {
		super.delete(menbersOnline);
	}
	
}