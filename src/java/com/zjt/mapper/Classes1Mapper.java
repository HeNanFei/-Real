package com.zjt.mapper;

import com.zjt.pojo.Classes1;
import com.zjt.pojo.Classes1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Classes1Mapper {
    int countByExample(Classes1Example example);

    int deleteByExample(Classes1Example example);

    int deleteByPrimaryKey(Integer cno);

    int insert(Classes1 record);

    int insertSelective(Classes1 record);

    List<Classes1> selectByExample(Classes1Example example);

    Classes1 selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") Classes1 record, @Param("example") Classes1Example example);

    int updateByExample(@Param("record") Classes1 record, @Param("example") Classes1Example example);

    int updateByPrimaryKeySelective(Classes1 record);

    int updateByPrimaryKey(Classes1 record);
}