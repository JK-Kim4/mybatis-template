package com.changbi.admin.controller;

import com.changbi.admin.domain.User;
import com.changbi.admin.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    /*로그인 페이지*/
    @GetMapping(value = "/login")
    public String login(){
        return "contents/user/login";
    }

    /*회원가입 페이지*/
    @GetMapping(value = "/signUp")
    public String signUp(){
        return "contents/user/sign-up";
    }

    /*로그인 실패*/
    @GetMapping(value = "/login/fail")
    public String loginfail(){
        return "contents/user/login-fail";
    }

    /*회원가입*/
    @PostMapping("/signUp")
    public String signUp(User user) {
        userService.signUpUser(user);
        return "redirect:/";
    }

    /* 사용자 로그인 */
    @GetMapping(value = "/login/success")
    public String loginSuccess(Model model, Authentication authentication){
        //Authentication 객체로 사용자 정보 조회
        User user = (User) authentication.getPrincipal();
        model.addAttribute("info", "user id = " +user.getUserId());
        return "contents/user/login-success";
    }
}
