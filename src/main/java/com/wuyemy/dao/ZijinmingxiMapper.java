package com.wuyemy.dao;

import com.wuyemy.bean.Zijinmingxi;
import com.wuyemy.bean.ZijinmingxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZijinmingxiMapper {
    long countByExample(ZijinmingxiExample example);

    int deleteByExample(ZijinmingxiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zijinmingxi record);

    int insertSelective(Zijinmingxi record);

    List<Zijinmingxi> selectByExample(ZijinmingxiExample example);

    Zijinmingxi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zijinmingxi record, @Param("example") ZijinmingxiExample example);

    int updateByExample(@Param("record") Zijinmingxi record, @Param("example") ZijinmingxiExample example);

    int updateByPrimaryKeySelective(Zijinmingxi record);

    int updateByPrimaryKey(Zijinmingxi record);
}