/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers.web;

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
import com.thinkgem.jeesite.modules.menbers.entity.Menbers;
import com.thinkgem.jeesite.modules.menbers.service.MenbersService;

/**
 * menbersController
 * @author menbers
 * @version 2018-08-17
 */
@Controller
@RequestMapping(value = "${adminPath}/menbers/menbers")
public class MenbersController extends BaseController {

	@Autowired
	private MenbersService menbersService;
	
	@ModelAttribute
	public Menbers get(@RequestParam(required=false) String id) {
		Menbers entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = menbersService.get(id);
		}
		if (entity == null){
			entity = new Menbers();
		}
		return entity;
	}
	
	@RequiresPermissions("menbers:menbers:view")
	@RequestMapping(value = {"list", ""})
	public String list(Menbers menbers, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Menbers> page = menbersService.findPage(new Page<Menbers>(request, response), menbers); 
		model.addAttribute("page", page);
		return "modules/menbers/menbersList";
	}

	@RequiresPermissions("menbers:menbers:view")
	@RequestMapping(value = "form")
	public String form(Menbers menbers, Model model) {
		model.addAttribute("menbers", menbers);
		return "modules/menbers/menbersForm";
	}

	@RequiresPermissions("menbers:menbers:edit")
	@RequestMapping(value = "save")
	public String save(Menbers menbers, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, menbers)){
			return form(menbers, model);
		}
		menbersService.save(menbers);
		addMessage(redirectAttributes, "保存menbers成功");
		return "redirect:"+Global.getAdminPath()+"/menbers/menbers/?repage";
	}
	
	@RequiresPermissions("menbers:menbers:edit")
	@RequestMapping(value = "delete")
	public String delete(Menbers menbers, RedirectAttributes redirectAttributes) {
		menbersService.delete(menbers);
		addMessage(redirectAttributes, "删除menbers成功");
		return "redirect:"+Global.getAdminPath()+"/menbers/menbers/?repage";
	}

}