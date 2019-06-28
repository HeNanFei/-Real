package com.zjt.mapper;

import com.zjt.pojo.Grade1;
import com.zjt.pojo.Grade1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Grade1Mapper {
    int countByExample(Grade1Example example);

    int deleteByExample(Grade1Example example);

    int deleteByPrimaryKey(String grade);

    int insert(Grade1 record);

    int insertSelective(Grade1 record);

    List<Grade1> selectByExample(Grade1Example example);

    int updateByExampleSelective(@Param("record") Grade1 record, @Param("example") Grade1Example example);

    int updateByExample(@Param("record") Grade1 record, @Param("example") Grade1Example example);
}