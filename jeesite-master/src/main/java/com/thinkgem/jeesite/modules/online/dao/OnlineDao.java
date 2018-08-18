/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.online.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.online.entity.Online;

/**
 * onlineDAO接口
 * @author online
 * @version 2018-08-17
 */
@MyBatisDao
public interface OnlineDao extends CrudDao<Online> {
	
}