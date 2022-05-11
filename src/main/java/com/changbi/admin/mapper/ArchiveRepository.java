package com.changbi.admin.mapper;

import com.changbi.admin.domain.Archive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArchiveRepository {

    List<Archive> selectAll();

}
