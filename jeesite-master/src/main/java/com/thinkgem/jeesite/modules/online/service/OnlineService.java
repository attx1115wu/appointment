/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.online.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.online.entity.Online;
import com.thinkgem.jeesite.modules.online.dao.OnlineDao;

/**
 * onlineService
 * @author online
 * @version 2018-08-17
 */
@Service
@Transactional(readOnly = true)
public class OnlineService extends CrudService<OnlineDao, Online> {

	public Online get(String id) {
		return super.get(id);
	}
	
	public List<Online> findList(Online online) {
		return super.findList(online);
	}
	
	public Page<Online> findPage(Page<Online> page, Online online) {
		return super.findPage(page, online);
	}
	
	@Transactional(readOnly = false)
	public void save(Online online) {
		super.save(online);
	}
	
	@Transactional(readOnly = false)
	public void delete(Online online) {
		super.delete(online);
	}
	
}