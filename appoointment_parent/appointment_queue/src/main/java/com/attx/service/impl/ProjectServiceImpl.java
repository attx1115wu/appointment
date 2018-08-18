package com.attx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attx.entity.PageResult;
import com.attx.mapper.ProjectMapper;
import com.attx.pojo.Project;
import com.attx.service.ProjectService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectMapper projectMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<Project> getProjectList() {
		return projectMapper.selectByExample(null);
	}

	/**
	 * 分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Project> page = (Page<Project>) projectMapper.selectByExample(null);
		long total = page.getTotal();
		List<Project> result = page.getResult();
		return new PageResult(total, result);
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Project project) {
		project.setStatus("1");
		projectMapper.insert(project);
	}

	/**
	 * 修改状态
	 */
	@Override
	public void updateStatus(Integer proId, String status) {
		Project project = projectMapper.selectByPrimaryKey(proId);
		// 设置状态
		project.setStatus(status);
		projectMapper.updateByPrimaryKey(project);
	}

	/**
	 * 设置批数上线
	 */
	@Override
	public void updateAllGroup(Integer proId,String allGroup){
		Project project = projectMapper.selectByPrimaryKey(proId);
		// 修改批数上限
		project.setAllGroup(allGroup);
		projectMapper.updateByPrimaryKey(project);
	}

	/**
	 * 根据ID获取实体
	 * @param proId
	 * @return
	 */
	public Project findOne(Integer proId) {
		return projectMapper.selectByPrimaryKey(proId);
	}

	/**
	 * 批量删除,修改字段属性值，1正常  2删除
	 */
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			Project project = projectMapper.selectByPrimaryKey(id);
			project.setIsdelete("2");// 表示逻辑删除
			projectMapper.updateByPrimaryKey(project);
		}
	}
	
}
