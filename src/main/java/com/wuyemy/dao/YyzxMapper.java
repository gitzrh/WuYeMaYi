package com.wuyemy.dao;

import com.wuyemy.bean.Yyzx;
import com.wuyemy.bean.YyzxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzxMapper {
    long countByExample(YyzxExample example);

    int deleteByExample(YyzxExample example);

    int deleteByPrimaryKey(Integer yyzxid);

    int insert(Yyzx record);

    int insertSelective(Yyzx record);

    List<Yyzx> selectByExample(YyzxExample example);

    Yyzx selectByPrimaryKey(Integer yyzxid);

    int updateByExampleSelective(@Param("record") Yyzx record, @Param("example") YyzxExample example);

    int updateByExample(@Param("record") Yyzx record, @Param("example") YyzxExample example);

    int updateByPrimaryKeySelective(Yyzx record);

    int updateByPrimaryKey(Yyzx record);
}