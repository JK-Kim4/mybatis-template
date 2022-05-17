package com.changbi.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@Slf4j
public class HomeController {

    @GetMapping(value = {"/index", "/"})
    public String index(){
        return "layouts/main";
    }

    @GetMapping("/login")
    public String login(){
        return "contents/user/login";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
