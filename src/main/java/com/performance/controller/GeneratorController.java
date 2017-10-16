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

import com.performance.service.GeneratorService;


@Controller
@RequestMapping("/generator")
public class GeneratorController {
	private static final Logger logger = LoggerFactory.getLogger(GeneratorController.class);
	
	@Autowired
	GeneratorService generatorService;
	
	@RequestMapping(value="/getGen/{gid}",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getGenerator(@PathVariable(value="gid")String gid){
		String result = generatorService.getOneGeneratorData(gid);
		logger.info(" /generator/getGen  param="+gid+" result="+result);
		return result;
	}
	
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String getAllGeneratorJSon(){
		String resultStr = generatorService.getAllGenerator("");
		resultStr = "{\"data\":"+resultStr+"}";
		return resultStr;
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String submitGeneratorJson(@RequestParam(value="generator",defaultValue="")String generator){
		int result = generatorService.addGenerator(generator);
		logger.info(" /submit data is "+generator+" result = "+result); 
		return "OK";
	}
	
	
}
