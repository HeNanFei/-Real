package com.zjt.mapper;

import com.zjt.pojo.Project1;
import com.zjt.pojo.Project1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Project1Mapper {
    int countByExample(Project1Example example);

    int deleteByExample(Project1Example example);

    int insert(Project1 record);

    int insertSelective(Project1 record);

    List<Project1> selectByExample(Project1Example example);

    int updateByExampleSelective(@Param("record") Project1 record, @Param("example") Project1Example example);

    int updateByExample(@Param("record") Project1 record, @Param("example") Project1Example example);
}