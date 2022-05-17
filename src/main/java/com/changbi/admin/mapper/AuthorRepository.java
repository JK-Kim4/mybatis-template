package com.changbi.admin.mapper;

import com.changbi.admin.domain.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorRepository {

    List<Author> selectAllAuthors();
}