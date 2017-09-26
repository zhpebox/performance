package com.performance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.performance.dao.TblModuleMapper;
import com.performance.model.TblModule;
import com.performance.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {
	private static final Logger logger = LoggerFactory.getLogger(ModuleServiceImpl.class);
	
	@Autowired
	TblModuleMapper tblModuleMapper;
	
	@Override
	public int saveMudule(String moduleStr) {
		TblModule tblModule = JSON.parseObject(moduleStr, new TypeReference<TblModule>(){});
		
		int result = tblModuleMapper.insert(tblModule);
		return result;
	}

}
