package com.changbi.admin.controller;

import com.changbi.admin.service.AuthorService;
import com.changbi.admin.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@Slf4j
public class HomeController {

    private final AuthorService authorService;
    private final BookService bookService;


    /*index 우회*/
    @GetMapping(value = {"/index", "/"})
    public String index(){
        return "layouts/main";
    }

    /*login 페이지 우회*//*
    @GetMapping("/test/login")
    public String login(){
        return "contents/user/login";
    }*/

    /*저자 목록 페이지*/
    @GetMapping("/authors")
    public String authorListPage(Model model){

        model.addAttribute("list", authorService.selectAllAuthors());

        return "contents/author/list";
    }

    /*저자 등록 페이지*/
    @GetMapping("/author/save")
    public String authorSavepage(){
        return "contents/author/save";
    }

    /*도서 목록 페이지*/
    @GetMapping("/books")
    public String bookListPage(Model model){

        model.addAttribute("list", bookService.selectAllBooks());

        return "contents/book/list";
    }

    /*도서 등록 페이지*/
    @GetMapping("/book/save")
    public String bookSavePage(){
        return "contents/book/save";
    }

}
