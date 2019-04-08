package com.wuyemy.dao;

import com.wuyemy.bean.Jifen;
import com.wuyemy.bean.JifenExample;
import com.wuyemy.bean.JifenZonghe;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JifenMapper {
    long countByExample(JifenExample example);

    int deleteByExample(JifenExample example);

    int deleteByPrimaryKey(Integer jifenid);

    int insert(Jifen record);
    
    BigDecimal selectjifeFXzonghe();
    BigDecimal selectjifeGCzonghe();
    BigDecimal selectjifeZTzonghe();
    BigDecimal selectjifeCJzonghe();
    
    int insertSelective(Jifen record);

    List<Jifen> selectByExample(JifenExample example);

    Jifen selectByPrimaryKey(Integer jifenid);

    int updateByExampleSelective(@Param("record") Jifen record, @Param("example") JifenExample example);

    int updateByExample(@Param("record") Jifen record, @Param("example") JifenExample example);

    int updateByPrimaryKeySelective(Jifen record);

    int updateByPrimaryKey(Jifen record);
}