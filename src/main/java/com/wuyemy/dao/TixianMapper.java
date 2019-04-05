package com.wuyemy.dao;

import com.wuyemy.bean.Tixian;
import com.wuyemy.bean.TixianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TixianMapper {
    long countByExample(TixianExample example);

    int deleteByExample(TixianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tixian record);

    int insertSelective(Tixian record);

    List<Tixian> selectByExample(TixianExample example);
    //关联状态查询
    List<Tixian> selectByExamplewithZhuangtai(TixianExample example);
    List<Tixian> selectByExamplewithZhuangtai6(TixianExample example);
    List<Tixian> selectByExamplewithZhuangtai7(TixianExample example);

    Tixian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tixian record, @Param("example") TixianExample example);

    int updateByExample(@Param("record") Tixian record, @Param("example") TixianExample example);

    int updateByPrimaryKeySelective(Tixian record);

    int updateByPrimaryKey(Tixian record);
}