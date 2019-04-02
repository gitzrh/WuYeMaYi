package com.wuyemy.dao;

import com.wuyemy.bean.Xiaozu;
import com.wuyemy.bean.XiaozuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaozuMapper {
    long countByExample(XiaozuExample example);

    int deleteByExample(XiaozuExample example);

    int insert(Xiaozu record);

    int insertSelective(Xiaozu record);

    List<Xiaozu> selectByExample(XiaozuExample example);

    int updateByExampleSelective(@Param("record") Xiaozu record, @Param("example") XiaozuExample example);

    int updateByExample(@Param("record") Xiaozu record, @Param("example") XiaozuExample example);
    
    //查询当前最大的zid
    int selectMaxZid();
    //查询在相同zid中最大的zidd
    int selectMaxZidd(XiaozuExample example);
}