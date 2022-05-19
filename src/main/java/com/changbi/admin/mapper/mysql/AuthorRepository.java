package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.Author;

import java.util.List;

public interface AuthorRepository {

    List<Author> selectAllAuthors();
}
