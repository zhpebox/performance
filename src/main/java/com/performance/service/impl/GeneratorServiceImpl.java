package com.performance.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.performance.dao.TblGeneratorMapper;
import com.performance.model.TblGenerator;
import com.performance.service.GeneratorService;

@Service
public class GeneratorServiceImpl implements GeneratorService {
	private static final Logger logger = LoggerFactory.getLogger(GeneratorServiceImpl.class);
	
	@Autowired
	TblGeneratorMapper tblGeneratorMapper;
	
	@Override
	public String getAllGenerator(String param) {
		List<TblGenerator> resultList = tblGeneratorMapper.selectByExample(null);
		String resultStr = JSONObject.toJSONString(resultList);
		return resultStr;
	}

	@Override
	public String getOneGeneratorData(String gid) {
		TblGenerator result = tblGeneratorMapper.selectByPrimaryKey(Integer.parseInt(gid));
		String resultStr = JSONObject.toJSONString(result);
		return resultStr;
	}

//	int result = tblModuleMapper.insert(tblModule);
//	if(result!=1){
//		logger.error("module 插入数据库失败！"+tblModule.toString());
//		return 0;
//	}
//	return tblModule.getModuleId();
	
	@Override
	public int addGenerator(String generator) {
		TblGenerator tblGenerator = JSONObject.parseObject(generator, new TypeReference<TblGenerator>(){});
		int result = tblGeneratorMapper.insertSelective(tblGenerator);
		if(result!=1){
			logger.error(" generaor 插入数据库失败！"+tblGenerator.toString());
			return 0;
		}
		return tblGenerator.getGid();
	}

}
