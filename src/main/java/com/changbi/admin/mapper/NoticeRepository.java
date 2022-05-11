package com.changbi.admin.mapper;

import com.changbi.admin.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeRepository {

    List<Notice> selectAll();
}
