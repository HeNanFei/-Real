package com.zjt.controller;

import com.zjt.pojo.Mainmenu;
import com.zjt.service.MenuService;
import com.zjt.util.JsonWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("getMenu.action")
    public void getMenu(HttpServletResponse response){
        System.out.println("到了");
        List<Mainmenu> menu = menuService.getMenu();
        for (Mainmenu mainmenu:menu
             ) {
            System.out.println("menu                "+mainmenu);
        }
        

        JsonWrite.finalJson(menu,response);
    }
}
