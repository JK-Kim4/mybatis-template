package com.changbi.admin.controller;

import com.changbi.admin.domain.Book;
import com.changbi.admin.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/book/api")
@RestController
@AllArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    @ResponseBody
    public List<Book> selectAllBooks(){

        return bookService.selectAllBooks();

    }
}
