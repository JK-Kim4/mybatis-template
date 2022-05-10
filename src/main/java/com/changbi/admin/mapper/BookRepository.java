package com.changbi.admin.mapper;

import com.changbi.admin.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookRepository {

    List<Book> selectAll();

}
