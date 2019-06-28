package com.zjt.mapper;

import com.zjt.pojo.Sp1;
import com.zjt.pojo.Sp1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sp1Mapper {
    int countByExample(Sp1Example example);

    int deleteByExample(Sp1Example example);

    int insert(Sp1 record);

    int insertSelective(Sp1 record);

    List<Sp1> selectByExample(Sp1Example example);

    int updateByExampleSelective(@Param("record") Sp1 record, @Param("example") Sp1Example example);

    int updateByExample(@Param("record") Sp1 record, @Param("example") Sp1Example example);
}