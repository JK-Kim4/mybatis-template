package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.MenuCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuRepository {

    List<MenuCode> selectAllCodes();
}
