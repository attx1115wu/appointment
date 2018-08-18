/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers_online.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.menbers_online.entity.MenbersOnline;

/**
 * menbers_onlineDAO接口
 * @author menbers_online
 * @version 2018-08-17
 */
@MyBatisDao
public interface MenbersOnlineDao extends CrudDao<MenbersOnline> {
	
}