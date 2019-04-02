package com.wuyemy.dao;

import com.wuyemy.bean.Zixunguanli;
import com.wuyemy.bean.ZixunguanliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZixunguanliMapper {
    long countByExample(ZixunguanliExample example);

    int deleteByExample(ZixunguanliExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zixunguanli record);

    int insertSelective(Zixunguanli record);

    List<Zixunguanli> selectByExampleWithBLOBs(ZixunguanliExample example);

    List<Zixunguanli> selectByExample(ZixunguanliExample example);

    Zixunguanli selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zixunguanli record, @Param("example") ZixunguanliExample example);

    int updateByExampleWithBLOBs(@Param("record") Zixunguanli record, @Param("example") ZixunguanliExample example);

    int updateByExample(@Param("record") Zixunguanli record, @Param("example") ZixunguanliExample example);

    int updateByPrimaryKeySelective(Zixunguanli record);

    int updateByPrimaryKeyWithBLOBs(Zixunguanli record);

    int updateByPrimaryKey(Zixunguanli record);
}