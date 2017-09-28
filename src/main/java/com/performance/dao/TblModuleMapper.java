package com.performance.dao;

import com.performance.model.TblModule;
import com.performance.model.TblModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblModuleMapper {
    long countByExample(TblModuleExample example);

    int deleteByExample(TblModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(TblModule record);

    int insertSelective(TblModule record);

    List<TblModule> selectByExample(TblModuleExample example);

    TblModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") TblModule record, @Param("example") TblModuleExample example);

    int updateByExample(@Param("record") TblModule record, @Param("example") TblModuleExample example);

    int updateByPrimaryKeySelective(TblModule record);

    int updateByPrimaryKey(TblModule record);
}