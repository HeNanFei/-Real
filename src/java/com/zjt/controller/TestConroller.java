package com.zjt.controller;

import com.zjt.pojo.Role;
import com.zjt.pojo.RoleTestPojo;
import com.zjt.pojo.TestPojo;
import com.zjt.service.RoleService;
import com.zjt.service.TestPojoService;
import com.zjt.util.JsonWrite;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class TestConroller {
    @Autowired
    private TestPojoService tps;
    @Autowired
    private RoleService rs;
    @RequestMapping("TestC.action")
    public void test(HttpServletResponse response)throws IOException {
        List<Role> roles = rs.selectRole();
        for (Role role: roles
             ) {
            System.out.println("the role you get"+role);
        }

        String msg = "No bugs";
            System.out.println("No Bug");
        JsonWrite.finalJson(msg,response);


    }
    @RequestMapping("getMenuById.action")
    public void getMenuById(int roleid,HttpServletResponse response){

        System.out.println("到了getMenuById");
        RoleTestPojo menuById = tps.getMenuById(roleid);
        List<TestPojo> list = menuById.getList();

        JsonWrite.finalJson(list,response);
    }
}
