package com.wuyemy.dao;

import com.wuyemy.bean.Sdjilu;
import com.wuyemy.bean.SdjiluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SdjiluMapper {
    long countByExample(SdjiluExample example);

    int deleteByExample(SdjiluExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sdjilu record);

    int insertSelective(Sdjilu record);

    List<Sdjilu> selectByExample(SdjiluExample example);

    Sdjilu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sdjilu record, @Param("example") SdjiluExample example);

    int updateByExample(@Param("record") Sdjilu record, @Param("example") SdjiluExample example);

    int updateByPrimaryKeySelective(Sdjilu record);

    int updateByPrimaryKey(Sdjilu record);
}