/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.groups.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.groups.entity.Groups;
import com.thinkgem.jeesite.modules.groups.service.GroupsService;

/**
 * groupsController
 * @author groups
 * @version 2018-08-17
 */
@Controller
@RequestMapping(value = "${adminPath}/groups/groups")
public class GroupsController extends BaseController {

	@Autowired
	private GroupsService groupsService;
	
	@ModelAttribute
	public Groups get(@RequestParam(required=false) String id) {
		Groups entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = groupsService.get(id);
		}
		if (entity == null){
			entity = new Groups();
		}
		return entity;
	}
	
	@RequiresPermissions("groups:groups:view")
	@RequestMapping(value = {"list", ""})
	public String list(Groups groups, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Groups> page = groupsService.findPage(new Page<Groups>(request, response), groups); 
		model.addAttribute("page", page);
		return "modules/groups/groupsList";
	}

	@RequiresPermissions("groups:groups:view")
	@RequestMapping(value = "form")
	public String form(Groups groups, Model model) {
		model.addAttribute("groups", groups);
		return "modules/groups/groupsForm";
	}

	@RequiresPermissions("groups:groups:edit")
	@RequestMapping(value = "save")
	public String save(Groups groups, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, groups)){
			return form(groups, model);
		}
		groupsService.save(groups);
		addMessage(redirectAttributes, "保存增加、修改和删除成功");
		return "redirect:"+Global.getAdminPath()+"/groups/groups/?repage";
	}
	
	@RequiresPermissions("groups:groups:edit")
	@RequestMapping(value = "delete")
	public String delete(Groups groups, RedirectAttributes redirectAttributes) {
		groupsService.delete(groups);
		addMessage(redirectAttributes, "删除增加、修改和删除成功");
		return "redirect:"+Global.getAdminPath()+"/groups/groups/?repage";
	}

}