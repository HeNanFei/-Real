package com.zjt.mapper;

import com.zjt.pojo.Prescore1;
import com.zjt.pojo.Prescore1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Prescore1Mapper {
    int countByExample(Prescore1Example example);

    int deleteByExample(Prescore1Example example);

    int insert(Prescore1 record);

    int insertSelective(Prescore1 record);

    List<Prescore1> selectByExample(Prescore1Example example);

    int updateByExampleSelective(@Param("record") Prescore1 record, @Param("example") Prescore1Example example);

    int updateByExample(@Param("record") Prescore1 record, @Param("example") Prescore1Example example);
}