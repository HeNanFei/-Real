package com.zjt.service;

import com.zjt.pojo.RoleTestPojo;
import com.zjt.pojo.TestPojo;

import java.util.List;

public interface TestPojoService {
    List<TestPojo> getMenu();

    RoleTestPojo getMenuById(int roleid);
}
