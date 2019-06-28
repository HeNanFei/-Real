package com.zjt.mapper;

import com.zjt.pojo.Teacher1;
import com.zjt.pojo.Teacher1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Teacher1Mapper {
    int countByExample(Teacher1Example example);

    int deleteByExample(Teacher1Example example);

    int deleteByPrimaryKey(String tname);

    int insert(Teacher1 record);

    int insertSelective(Teacher1 record);

    List<Teacher1> selectByExample(Teacher1Example example);

    Teacher1 selectByPrimaryKey(String tname);

    int updateByExampleSelective(@Param("record") Teacher1 record, @Param("example") Teacher1Example example);

    int updateByExample(@Param("record") Teacher1 record, @Param("example") Teacher1Example example);

    int updateByPrimaryKeySelective(Teacher1 record);

    int updateByPrimaryKey(Teacher1 record);
}