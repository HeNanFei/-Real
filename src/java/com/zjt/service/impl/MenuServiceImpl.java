package com.zjt.service.impl;

import com.zjt.mapper.MainmenuMapper;
import com.zjt.pojo.Mainmenu;
import com.zjt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MainmenuMapper mm;

    @Override
    public List<Mainmenu> getMenu() {
        return mm.getMenu();
    }
}
