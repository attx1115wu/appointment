package com.attx.mapper;

import com.attx.pojo.MenbersOnline;
import com.attx.pojo.MenbersOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenbersOnlineMapper {
    int countByExample(MenbersOnlineExample example);

    int deleteByExample(MenbersOnlineExample example);

    int insert(MenbersOnline record);

    int insertSelective(MenbersOnline record);

    List<MenbersOnline> selectByExample(MenbersOnlineExample example);

    int updateByExampleSelective(@Param("record") MenbersOnline record, @Param("example") MenbersOnlineExample example);

    int updateByExample(@Param("record") MenbersOnline record, @Param("example") MenbersOnlineExample example);
}