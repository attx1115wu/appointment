package com.attx.mapper;

import com.attx.pojo.Groups;
import com.attx.pojo.GroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsMapper {
    int countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int insert(Groups record);

    int insertSelective(Groups record);

    List<Groups> selectByExample(GroupsExample example);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);
}