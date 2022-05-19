package com.changbi.admin.service;

import com.changbi.admin.domain.Book;
import com.changbi.admin.mapper.mysql.BookRepository;
import com.changbi.admin.mapper.oracle.OracleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final OracleRepository oracleRepository;

    public List<Book> selectAllBooks(){
        return bookRepository.selectAllBooks();
    }

    public HashMap<String, Object> getBookDetail(String bookName){
        return oracleRepository.getBookDetail(bookName);
    }
}
