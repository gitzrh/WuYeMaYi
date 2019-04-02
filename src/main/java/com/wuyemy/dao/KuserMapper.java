package com.wuyemy.dao;

import com.wuyemy.bean.Kuser;
import com.wuyemy.bean.KuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuserMapper {
    long countByExample(KuserExample example);

    int deleteByExample(KuserExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(Kuser record);

    int insertSelective(Kuser record);

    List<Kuser> selectByExample(KuserExample example);
    //带状态的查询未激活
    List<Kuser> selectByExampleWithZhuangTai(KuserExample example);
    
    //带状态和积分的查询已激活
    List<Kuser> selectByExampleWithZhuangTaiAndJf(KuserExample example);
   

    Kuser selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") Kuser record, @Param("example") KuserExample example);

    int updateByExample(@Param("record") Kuser record, @Param("example") KuserExample example);

    int updateByPrimaryKeySelective(Kuser record);

    int updateByPrimaryKey(Kuser record);
}