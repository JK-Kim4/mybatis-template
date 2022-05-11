package com.changbi.admin.controller;

import com.changbi.admin.domain.MenuCode;
import com.changbi.admin.service.MenuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/menus")
    @ResponseBody
    public List<MenuCode> selectAllCodes(){
        return menuService.selectAllCodes();
    }
}
