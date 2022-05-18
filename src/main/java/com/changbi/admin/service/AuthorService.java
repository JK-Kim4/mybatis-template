package com.changbi.admin.service;

import com.changbi.admin.domain.Author;
import com.changbi.admin.mapper.mysql.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> selectAllAuthors(){
        return authorRepository.selectAllAuthors();
    }

}
