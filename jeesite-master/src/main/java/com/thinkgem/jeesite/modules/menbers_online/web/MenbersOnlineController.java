/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.menbers_online.web;

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
import com.thinkgem.jeesite.modules.menbers_online.entity.MenbersOnline;
import com.thinkgem.jeesite.modules.menbers_online.service.MenbersOnlineService;

/**
 * menbers_onlineController
 * @author menbers_online
 * @version 2018-08-17
 */
@Controller
@RequestMapping(value = "${adminPath}/menbers_online/menbersOnline")
public class MenbersOnlineController extends BaseController {

	@Autowired
	private MenbersOnlineService menbersOnlineService;
	
	@ModelAttribute
	public MenbersOnline get(@RequestParam(required=false) String id) {
		MenbersOnline entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = menbersOnlineService.get(id);
		}
		if (entity == null){
			entity = new MenbersOnline();
		}
		return entity;
	}
	
	@RequiresPermissions("menbers_online:menbersOnline:view")
	@RequestMapping(value = {"list", ""})
	public String list(MenbersOnline menbersOnline, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<MenbersOnline> page = menbersOnlineService.findPage(new Page<MenbersOnline>(request, response), menbersOnline); 
		model.addAttribute("page", page);
		return "modules/menbers_online/menbersOnlineList";
	}

	@RequiresPermissions("menbers_online:menbersOnline:view")
	@RequestMapping(value = "form")
	public String form(MenbersOnline menbersOnline, Model model) {
		model.addAttribute("menbersOnline", menbersOnline);
		return "modules/menbers_online/menbersOnlineForm";
	}

	@RequiresPermissions("menbers_online:menbersOnline:edit")
	@RequestMapping(value = "save")
	public String save(MenbersOnline menbersOnline, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, menbersOnline)){
			return form(menbersOnline, model);
		}
		menbersOnlineService.save(menbersOnline);
		addMessage(redirectAttributes, "保存menbers_online成功");
		return "redirect:"+Global.getAdminPath()+"/menbers_online/menbersOnline/?repage";
	}
	
	@RequiresPermissions("menbers_online:menbersOnline:edit")
	@RequestMapping(value = "delete")
	public String delete(MenbersOnline menbersOnline, RedirectAttributes redirectAttributes) {
		menbersOnlineService.delete(menbersOnline);
		addMessage(redirectAttributes, "删除menbers_online成功");
		return "redirect:"+Global.getAdminPath()+"/menbers_online/menbersOnline/?repage";
	}

}