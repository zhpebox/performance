package com.performance.service;

import java.util.List;

import com.performance.model.TblRule;

public interface RuleService {

	public int saveRule(String ruleStr);
	
	/**
	 * 根据paramObj的参数进行数据查询
	 * @param paramObj
	 * @return
	 */
	public String getRule(String param);
}
