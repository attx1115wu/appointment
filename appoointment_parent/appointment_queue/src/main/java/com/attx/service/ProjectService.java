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
	 * 修改状态、批数上线
	 */
	public void update(Project project);

	/**
	 * 根据ID获取实体
	 * @param proId
	 * @return
	 */
	public Project findOne(Integer proId);

	/**
	 * 批量删除
	 */
	public void delete(Integer[] ids);

	/**
	 * 新增
	 * @param project
	 */
	public void add(Project project);
	
}
