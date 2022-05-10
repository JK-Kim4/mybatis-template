package com.changbi.admin.controller;

import com.changbi.admin.domain.Book;
import com.changbi.admin.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping("/book/select/all")
    @ResponseBody
    public List<Book> selectAll(){

        return bookService.selectAll();

    }
}
