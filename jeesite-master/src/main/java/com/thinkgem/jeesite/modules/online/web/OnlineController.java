/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.online.web;

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
import com.thinkgem.jeesite.modules.online.entity.Online;
import com.thinkgem.jeesite.modules.online.service.OnlineService;

/**
 * onlineController
 * @author online
 * @version 2018-08-17
 */
@Controller
@RequestMapping(value = "${adminPath}/online/online")
public class OnlineController extends BaseController {

	@Autowired
	private OnlineService onlineService;
	
	@ModelAttribute
	public Online get(@RequestParam(required=false) String id) {
		Online entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = onlineService.get(id);
		}
		if (entity == null){
			entity = new Online();
		}
		return entity;
	}
	
	@RequiresPermissions("online:online:view")
	@RequestMapping(value = {"list", ""})
	public String list(Online online, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Online> page = onlineService.findPage(new Page<Online>(request, response), online); 
		model.addAttribute("page", page);
		return "modules/online/onlineList";
	}

	@RequiresPermissions("online:online:view")
	@RequestMapping(value = "form")
	public String form(Online online, Model model) {
		model.addAttribute("online", online);
		return "modules/online/onlineForm";
	}

	@RequiresPermissions("online:online:edit")
	@RequestMapping(value = "save")
	public String save(Online online, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, online)){
			return form(online, model);
		}
		onlineService.save(online);
		addMessage(redirectAttributes, "保存online成功");
		return "redirect:"+Global.getAdminPath()+"/online/online/?repage";
	}
	
	@RequiresPermissions("online:online:edit")
	@RequestMapping(value = "delete")
	public String delete(Online online, RedirectAttributes redirectAttributes) {
		onlineService.delete(online);
		addMessage(redirectAttributes, "删除online成功");
		return "redirect:"+Global.getAdminPath()+"/online/online/?repage";
	}

}