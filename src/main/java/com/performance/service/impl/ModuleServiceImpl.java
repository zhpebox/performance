package com.performance.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public int saveMudule(String moduleStr) {
		TblModule tblModule = JSON.parseObject(moduleStr, new TypeReference<TblModule>(){});
		int result = tblModuleMapper.insert(tblModule);
		if(result!=1){
			logger.error("module 插入数据库失败！"+tblModule.toString());
			return 0;
		}
		return tblModule.getModuleId();
	}

	@Override
	public String getModuleById(String moduleId) {
		TblModule result = tblModuleMapper.selectByPrimaryKey(Integer.parseInt(moduleId));
		
		return JSON.toJSONString(result);
	}

	@Override
	public String getModuleList(String paramStr) {
		List<TblModule> resultList = tblModuleMapper.selectByExample(null);
		String resultStr = JSON.toJSONString(resultList);
		resultStr = resultStr.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		return resultStr;
	}

}
