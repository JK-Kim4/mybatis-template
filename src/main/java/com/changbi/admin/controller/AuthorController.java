package com.changbi.admin.controller;

import com.changbi.admin.domain.Author;
import com.changbi.admin.service.AuthorService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author/api")
@AllArgsConstructor
@Slf4j
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> selectAllAuthors(){
        return authorService.selectAllAuthors();
    }

}
