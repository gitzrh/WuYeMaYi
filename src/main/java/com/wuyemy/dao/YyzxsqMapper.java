package com.wuyemy.dao;

import com.wuyemy.bean.Yyzxsq;
import com.wuyemy.bean.YyzxsqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzxsqMapper {
    long countByExample(YyzxsqExample example);

    int deleteByExample(YyzxsqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Yyzxsq record);

    int insertSelective(Yyzxsq record);

    List<Yyzxsq> selectByExample(YyzxsqExample example);

    Yyzxsq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Yyzxsq record, @Param("example") YyzxsqExample example);

    int updateByExample(@Param("record") Yyzxsq record, @Param("example") YyzxsqExample example);

    int updateByPrimaryKeySelective(Yyzxsq record);

    int updateByPrimaryKey(Yyzxsq record);
}