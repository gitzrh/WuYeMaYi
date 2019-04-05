package com.wuyemy.dao;

import com.wuyemy.bean.Manage;
import com.wuyemy.bean.ManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageMapper {
    long countByExample(ManageExample example);

    int deleteByExample(ManageExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageExample example);

    Manage selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
    
}