package com.zjt.controller;

import com.zjt.mapper.TestPojoMapper;
import com.zjt.pojo.TestPojo;
import com.zjt.service.TestPojoService;
import com.zjt.util.JsonWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class TestPojoController {
    @Autowired
    private TestPojoService ts;
    @RequestMapping("getMenu2.action")
    public void getMenu2(HttpServletResponse response){
        System.out.println("到了getMenu2");
        List<TestPojo> menu = ts.getMenu();
        for (TestPojo testPojo:menu
             ) {
            System.out.println(testPojo+"获得的菜单节点");
        }
        JsonWrite.finalJson(menu,response);
    }
}
