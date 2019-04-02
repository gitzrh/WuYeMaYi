package com.wuyemy.dao;

import com.wuyemy.bean.Jinbilx;
import com.wuyemy.bean.JinbilxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinbilxMapper {
    long countByExample(JinbilxExample example);

    int deleteByExample(JinbilxExample example);

    int insert(Jinbilx record);

    int insertSelective(Jinbilx record);

    List<Jinbilx> selectByExample(JinbilxExample example);

    int updateByExampleSelective(@Param("record") Jinbilx record, @Param("example") JinbilxExample example);

    int updateByExample(@Param("record") Jinbilx record, @Param("example") JinbilxExample example);
}