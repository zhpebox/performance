package com.performance.dao;

import com.performance.model.TblGenerator;
import com.performance.model.TblGeneratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblGeneratorMapper {
    long countByExample(TblGeneratorExample example);

    int deleteByExample(TblGeneratorExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(TblGenerator record);

    int insertSelective(TblGenerator record);

    List<TblGenerator> selectByExample(TblGeneratorExample example);

    TblGenerator selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") TblGenerator record, @Param("example") TblGeneratorExample example);

    int updateByExample(@Param("record") TblGenerator record, @Param("example") TblGeneratorExample example);

    int updateByPrimaryKeySelective(TblGenerator record);

    int updateByPrimaryKey(TblGenerator record);
}