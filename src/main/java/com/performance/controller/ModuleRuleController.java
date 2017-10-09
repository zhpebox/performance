package com.performance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.performance.service.ModuleRuleService;

@Controller
@RequestMapping("/moduleRule")
public class ModuleRuleController {
	private static final Logger logger = LoggerFactory.getLogger(ModuleRuleController.class);
	
	@Autowired
	ModuleRuleService moduleRuleService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String addModuleRule(@RequestParam(value="moduleRuleData",defaultValue="")String moduleRuleData){
		logger.info("/moduleRule/add here submit is = "+moduleRuleData);
		moduleRuleService.saveModuleRule(moduleRuleData);
		return "OK";
	}
}
