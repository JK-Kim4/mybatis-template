package com.changbi.admin.service;

import com.changbi.admin.domain.Book;
import com.changbi.admin.mapper.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> selectAllBooks(){
        return bookRepository.selectAllBooks();
    }
}
