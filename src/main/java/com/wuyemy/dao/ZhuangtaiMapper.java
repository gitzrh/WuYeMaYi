package com.wuyemy.dao;

import com.wuyemy.bean.Zhuangtai;
import com.wuyemy.bean.ZhuangtaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhuangtaiMapper {
    long countByExample(ZhuangtaiExample example);

    int deleteByExample(ZhuangtaiExample example);

    int insert(Zhuangtai record);

    int insertSelective(Zhuangtai record);

    List<Zhuangtai> selectByExample(ZhuangtaiExample example);

    int updateByExampleSelective(@Param("record") Zhuangtai record, @Param("example") ZhuangtaiExample example);

    int updateByExample(@Param("record") Zhuangtai record, @Param("example") ZhuangtaiExample example);
}