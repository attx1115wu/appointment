package com.attx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attx.entity.PageResult;
import com.attx.entity.Result;
import com.attx.pojo.Project;
import com.attx.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping("/getProjectList")
	public List<Project> getProjectList() {
		return projectService.getProjectList();
	}

	/**
	 * 分页查询
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("/findpage")
	public PageResult findPage(int page, int size) {

		return projectService.findPage(page, size);
	}
	
	/**
	 * 增加
	 * @param project
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(Project project) {
		try {
			projectService.add(project);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 修改状态:1正常2暂停3停止
	 * @param proId,status
	 * @return
	 */
	@RequestMapping("/updateStatus")
	public Result updateStatus(Integer proId, String status) {
		try {
			projectService.updateStatus(proId,status);
			return new Result(true, "修改状态成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改状态失败！");
		}
	}

	/**
	 * 设置批数上限
	 */
	@RequestMapping("/updateAllGroup")
	public Result updateAllGroup(Integer proId,String allGroup){
		try {
			projectService.updateAllGroup(proId,allGroup);
			return new Result(true, "修改批数上限成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改批数上限失败！");
		}
	}

	/**
	 * 获取实体
	 * 
	 * @param proId
	 * @return
	 */
	@RequestMapping("/findOne")
	public Project findOne(Integer proId) {
		return projectService.findOne(proId);
	}

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer[] ids) {
		try {
			projectService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
}
