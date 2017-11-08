package com.performance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.performance.model.TblModule;
import com.performance.service.ModuleService;

@Controller
@RequestMapping("/module")
public class ModuleController {
	private static final Logger logger = LoggerFactory.getLogger(ModuleController.class);
	
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String addDataModule(@RequestParam(value="moduleData",defaultValue="") String moduleData){
		String result = "";
		logger.info(" /module/add here submit is = "+moduleData); 
		int saveResult = moduleService.saveMudule(moduleData);
		logger.info("precess result "+result);
		result=saveResult!=0?String.valueOf(saveResult):"处理失败";
		return result;
	}
	
	@RequestMapping(value="/get/{moduleId}",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getDataModule(@PathVariable(value="moduleId")String moduleId){
		String result = moduleService.getModuleById(moduleId);
		return result;
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	@ResponseBody
	public String getAll(){
		String result = moduleService.getModuleList("");
		result = "{\"data\":"+result+"}";
		return result;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public String deleteModule(@RequestParam(value="moduleList")String moduleList){
		logger.info(" /delete moduleList="+moduleList);
		moduleService.deleteModule(moduleList);
		return "";
	}
	
}
