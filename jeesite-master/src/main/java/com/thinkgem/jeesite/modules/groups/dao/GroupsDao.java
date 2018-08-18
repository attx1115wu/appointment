/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.groups.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.groups.entity.Groups;

/**
 * groupsDAO接口
 * @author groups
 * @version 2018-08-17
 */
@MyBatisDao
public interface GroupsDao extends CrudDao<Groups> {
	
}