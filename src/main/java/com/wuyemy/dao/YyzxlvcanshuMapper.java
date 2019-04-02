package com.wuyemy.dao;

import com.wuyemy.bean.Yyzxlvcanshu;
import com.wuyemy.bean.YyzxlvcanshuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzxlvcanshuMapper {
    long countByExample(YyzxlvcanshuExample example);

    int deleteByExample(YyzxlvcanshuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yyzxlvcanshu record);

    int insertSelective(Yyzxlvcanshu record);

    List<Yyzxlvcanshu> selectByExample(YyzxlvcanshuExample example);

    Yyzxlvcanshu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Yyzxlvcanshu record, @Param("example") YyzxlvcanshuExample example);

    int updateByExample(@Param("record") Yyzxlvcanshu record, @Param("example") YyzxlvcanshuExample example);

    int updateByPrimaryKeySelective(Yyzxlvcanshu record);

    int updateByPrimaryKey(Yyzxlvcanshu record);
}