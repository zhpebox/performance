package com.performance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.performance.dao.TblModuleRuleMapper;
import com.performance.model.TblModuleRule;
import com.performance.service.ModuleRuleService;

@Service
public class ModuleRuleServiceImpl implements ModuleRuleService {
	private static final Logger logger = LoggerFactory.getLogger(ModuleRuleServiceImpl.class);
	@Autowired
	TblModuleRuleMapper tblModuleRuleMapper;
	
	@Override
	@Transactional
	public int saveModuleRule(String moduleRuleStr) {
		JSONObject source = JSONObject.parseObject(moduleRuleStr);
		JSONArray ruleArray = source.getJSONArray("ruleValues");
		TblModuleRule tblModuleRule = new TblModuleRule();
		tblModuleRule.setModuleKey(source.getInteger("moduleId"));
		for(int i=0;i<ruleArray.size();i++){
			tblModuleRule.setParamIndex(i);
			tblModuleRule.setRuleKey(ruleArray.getInteger(i));
			int result = tblModuleRuleMapper.insertSelective(tblModuleRule);
			logger.info(" save ModuleRule to DB, result is "+result+" value is "+tblModuleRule.toString()); 
		}
		return 0;
	}

}
