package com.wuyemy.dao;

import com.wuyemy.bean.Canshu;

import com.wuyemy.bean.CanshuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CanshuMapper {
    long countByExample(CanshuExample example);

    int deleteByExample(CanshuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Canshu record);

    int insertSelective(Canshu record);

    List<Canshu> selectByExample(CanshuExample example);

    Canshu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Canshu record, @Param("example") CanshuExample example);

    int updateByExample(@Param("record") Canshu record, @Param("example") CanshuExample example);

    int updateByPrimaryKeySelective(Canshu record);

    int updateByPrimaryKey(Canshu record);
}