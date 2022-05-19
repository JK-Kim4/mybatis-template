package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.Archive;

import java.util.List;

public interface ArchiveRepository {

    List<Archive> selectAll();

}
