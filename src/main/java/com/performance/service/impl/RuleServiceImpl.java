package com.performance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.performance.common.CommVariable;
import com.performance.dao.TblRuleMapper;
import com.performance.model.TblRule;
import com.performance.service.RuleService;

@Service
public class RuleServiceImpl implements RuleService {
	private static final Logger logger = LoggerFactory.getLogger(RuleServiceImpl.class);
	
	@Autowired
	private TblRuleMapper tblRuleMapper;
	
	@Override
	public int saveRule(String ruleStr) {
		TblRule tblRule = JSON.parseObject(ruleStr, new TypeReference<TblRule>(){});
		if(tblRule.getRuleSource()==CommVariable.RULE_SOURCE_FILE){
			tblRule.setClassName("");
			tblRule.setMethodName("");
		}else if(tblRule.getRuleSource()==CommVariable.RULE_SOURCE_CODE){
			tblRule.setParamFile("");
		}
		int result = tblRuleMapper.insert(tblRule);
		logger.debug("save rule = "+ruleStr+"  result is "+result);
		return result;
	}

}
