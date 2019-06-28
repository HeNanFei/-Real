package com.zjt.service.impl;

import com.zjt.mapper.RoleMapper;
import com.zjt.pojo.Role;
import com.zjt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper rm;
    @Override
    public List<Role> selectRole() {
        System.out.println("RoleService");
        try {
            List<Role> roles = rm.selectRole();
        }catch (Exception e){
            System.out.println(("RoleService出错了"));
            e.printStackTrace();
        }
        return rm.selectRole();
    }
}
