package com.performance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.performance.service.RuleService;

@Component
@RequestMapping("/rule")
public class RuleController {
	private static final Logger logger = LoggerFactory.getLogger(RuleController.class);
	
	@Autowired
	RuleService ruleService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String addRule(@RequestParam(value="rule",defaultValue="")String rule){
		logger.debug(" /rule/add here submit is = "+rule);
		int result = ruleService.saveRule(rule);
		return "successful!";
	}
}
