package com.changbi.admin.controller;

import com.changbi.admin.domain.Book;
import com.changbi.admin.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @GetMapping("/isbn")
    @ResponseBody
    public void getBookDetail(){
        String bookName = "꿈꾸는 소리";
        HashMap<String, Object> result = bookService.getBookDetail(bookName);
        log.info(result.toString());

    }
}
