package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.Book;

import java.util.List;

public interface BookRepository {

    List<Book> selectAllBooks();

}
