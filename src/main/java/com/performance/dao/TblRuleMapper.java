package com.performance.dao;

import com.performance.model.TblRule;
import com.performance.model.TblRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRuleMapper {
    int countByExample(TblRuleExample example);

    int deleteByExample(TblRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(TblRule record);

    int insertSelective(TblRule record);

    List<TblRule> selectByExample(TblRuleExample example);

    TblRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") TblRule record, @Param("example") TblRuleExample example);

    int updateByExample(@Param("record") TblRule record, @Param("example") TblRuleExample example);

    int updateByPrimaryKeySelective(TblRule record);

    int updateByPrimaryKey(TblRule record);
}