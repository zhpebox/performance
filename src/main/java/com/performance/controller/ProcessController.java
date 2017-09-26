package com.performance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.performance.model.TblModule;
import com.performance.service.ModuleService;

@Controller
@RequestMapping("/moduleData")
public class ProcessController {
	private static final Logger logger = LoggerFactory.getLogger(ProcessController.class);
	
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping(value="/submitModuleData",method=RequestMethod.POST,
			produces="application/json;charset=UTF-8")
	public String processDataModule(@RequestParam(value="moduleData",defaultValue="") String moduleData){
		//	,TblUser mo){
//		JSONObject a = (JSONObject) JSON.parse(s);
		TblModule b = JSON.parseObject(moduleData, new TypeReference<TblModule>(){});
		logger.info("Hello submit is here="+moduleData); 
		moduleService.saveMudule(moduleData);
		return "index";
	}
	
}
