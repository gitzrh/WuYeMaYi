package com.wuyemy.dao;

import com.wuyemy.bean.Lunbotu;
import com.wuyemy.bean.LunbotuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LunbotuMapper {
    long countByExample(LunbotuExample example);

    int deleteByExample(LunbotuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lunbotu record);

    int insertSelective(Lunbotu record);

    List<Lunbotu> selectByExample(LunbotuExample example);

    Lunbotu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lunbotu record, @Param("example") LunbotuExample example);

    int updateByExample(@Param("record") Lunbotu record, @Param("example") LunbotuExample example);

    int updateByPrimaryKeySelective(Lunbotu record);

    int updateByPrimaryKey(Lunbotu record);
}