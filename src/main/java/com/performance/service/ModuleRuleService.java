package com.performance.service;

public interface ModuleRuleService {
	
	/**
	 * 关联模板和规则，将关联关系入库t_module_rule，并把已经关联的模板入t_generator表
	 * @param moduleRuleStr
	 * @return
	 */
	public int saveModuleRule(String moduleRuleStr);
}
