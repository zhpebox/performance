package com.performance.service.impl;

import java.util.ArrayList;
import java.util.List;

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
		int result = tblRuleMapper.insertSelective(tblRule);
		logger.info("save rule = "+ruleStr+"  result is "+result);
		return result;
	}

	@Override
	public String getRule(String param) {
		List<TblRule> resultList = new ArrayList<TblRule>();
		if("".equals(param)){
			resultList = tblRuleMapper.selectByExample(null);
		}
		return JSON.toJSONString(resultList);
	}

}
