package com.attx.service;

import java.util.List;

import com.attx.pojo.Project;

import com.attx.entity.PageResult;

public interface ProjectService {

	/**
	 * 查询列表
	 * @return
	 */
	public List<Project> getProjectList();
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageResult findPage(int pageNum, int pageSize);
	
	/**
	 * 修改状态
	 */
	public void updateStatus(Integer proId, String status);

	/**
	 * 设置批数上线
	 */
	public void updateAllGroup(Integer proId,String allGroup);

	/**
	 * 根据ID获取实体
	 * @param proId
	 * @return
	 */
	public Project findOne(Integer proId);

	/**
	 * 批量删除，修改isdelete字段   1正常2删除
	 */
	public void delete(Integer[] ids);

	/**
	 * 新增
	 * @param project
	 */
	public void add(Project project);
	
}
