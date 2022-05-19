package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface NoticeRepository {

    List<Notice> selectAll();
}
