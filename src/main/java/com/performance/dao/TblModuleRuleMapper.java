package com.performance.dao;

import com.performance.model.TblModuleRule;
import com.performance.model.TblModuleRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblModuleRuleMapper {
    int countByExample(TblModuleRuleExample example);

    int deleteByExample(TblModuleRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblModuleRule record);

    int insertSelective(TblModuleRule record);

    List<TblModuleRule> selectByExample(TblModuleRuleExample example);

    TblModuleRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblModuleRule record, @Param("example") TblModuleRuleExample example);

    int updateByExample(@Param("record") TblModuleRule record, @Param("example") TblModuleRuleExample example);

    int updateByPrimaryKeySelective(TblModuleRule record);

    int updateByPrimaryKey(TblModuleRule record);
}