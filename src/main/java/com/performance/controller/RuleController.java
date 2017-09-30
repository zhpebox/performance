package com.performance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.performance.model.TblRule;
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
	
	@RequestMapping(value="/get/{ruleId}",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getRule(@PathVariable(value="ruleId",required=false)String ruleId){
		logger.debug(" /rule/get/{ruleId} 参数ruleId="+ruleId);
		return "HHH";
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getAllRule(){
		logger.debug(" /rule/get 参数ruleId=");
		String resultList = ruleService.getRule("");
		return resultList;
	}
}
