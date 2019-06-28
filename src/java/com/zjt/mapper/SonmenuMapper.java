package com.zjt.mapper;

import com.zjt.pojo.Sonmenu;
import com.zjt.pojo.SonmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonmenuMapper {
    int countByExample(SonmenuExample example);

    int deleteByExample(SonmenuExample example);

    int insert(Sonmenu record);

    int insertSelective(Sonmenu record);

    List<Sonmenu> selectByExample(SonmenuExample example);

    int updateByExampleSelective(@Param("record") Sonmenu record, @Param("example") SonmenuExample example);

    int updateByExample(@Param("record") Sonmenu record, @Param("example") SonmenuExample example);
}