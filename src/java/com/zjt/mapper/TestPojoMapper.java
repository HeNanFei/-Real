package com.zjt.mapper;

import com.zjt.pojo.Mainmenu;
import com.zjt.pojo.MainmenuExample;
import com.zjt.pojo.TestPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestPojoMapper {
    List<TestPojo> getMenu2();
}