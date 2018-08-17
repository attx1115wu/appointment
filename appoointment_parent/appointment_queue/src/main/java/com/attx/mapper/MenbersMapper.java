package com.attx.mapper;

import com.attx.pojo.Menbers;
import com.attx.pojo.MenbersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenbersMapper {
    int countByExample(MenbersExample example);

    int deleteByExample(MenbersExample example);

    int deleteByPrimaryKey(Integer memId);

    int insert(Menbers record);

    int insertSelective(Menbers record);

    List<Menbers> selectByExample(MenbersExample example);

    Menbers selectByPrimaryKey(Integer memId);

    int updateByExampleSelective(@Param("record") Menbers record, @Param("example") MenbersExample example);

    int updateByExample(@Param("record") Menbers record, @Param("example") MenbersExample example);

    int updateByPrimaryKeySelective(Menbers record);

    int updateByPrimaryKey(Menbers record);
}