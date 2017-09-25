package com.performance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/moduleData")
public class ProcessController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProcessController.class);
	
	@RequestMapping(value="/submitModuleData",method=RequestMethod.POST)
	public String processDataModule(@RequestParam(value="moduleData",defaultValue="") String user){
		//	,TblUser mo){
		logger.info("Hello submit is here="+user); 
		return "index";
	}
	
	@RequestMapping(value="/submitModuleDatas",method=RequestMethod.GET)
	public String processDataModuleT(@RequestParam(value="moduleData",defaultValue="") String user){
		logger.info("Hello submit is heres="+user); 
		return "indexs";
	}
}
