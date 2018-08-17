package com.attx.mapper;

import com.attx.pojo.Online;
import com.attx.pojo.OnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineMapper {
    int countByExample(OnlineExample example);

    int deleteByExample(OnlineExample example);

    int insert(Online record);

    int insertSelective(Online record);

    List<Online> selectByExample(OnlineExample example);

    int updateByExampleSelective(@Param("record") Online record, @Param("example") OnlineExample example);

    int updateByExample(@Param("record") Online record, @Param("example") OnlineExample example);
}