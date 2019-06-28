package com.zjt.mapper;

import com.zjt.pojo.Mainmenu;
import com.zjt.pojo.MainmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainmenuMapper {
    int countByExample(MainmenuExample example);

    int deleteByExample(MainmenuExample example);

    int insert(Mainmenu record);

    int insertSelective(Mainmenu record);

    List<Mainmenu> selectByExample(MainmenuExample example);

    int updateByExampleSelective(@Param("record") Mainmenu record, @Param("example") MainmenuExample example);

    int updateByExample(@Param("record") Mainmenu record, @Param("example") MainmenuExample example);

    List<Mainmenu> getMenu();
}