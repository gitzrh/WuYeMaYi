package com.wuyemy.dao;

import com.wuyemy.bean.Biandong;
import com.wuyemy.bean.BiandongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiandongMapper {
    long countByExample(BiandongExample example);

    int deleteByExample(BiandongExample example);

    int insert(Biandong record);

    int insertSelective(Biandong record);

    List<Biandong> selectByExample(BiandongExample example);

    int updateByExampleSelective(@Param("record") Biandong record, @Param("example") BiandongExample example);

    int updateByExample(@Param("record") Biandong record, @Param("example") BiandongExample example);
}