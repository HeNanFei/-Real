package com.zjt.controller;

import com.zjt.pojo.Role;
import com.zjt.service.RoleService;
import com.zjt.util.JsonWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService rs;
    @RequestMapping("selectRole.action")
    public void selectRole(HttpServletResponse response){
        List<Role> list = rs.selectRole();
        for (Role role:list
             ) {
            System.out.println(role);
        }
        JsonWrite.finalJson(list,response);
    }
}
