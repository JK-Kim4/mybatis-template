package com.changbi.admin.mapper.mysql;

import com.changbi.admin.domain.MenuCode;

import java.util.List;

public interface MenuRepository {

    List<MenuCode> selectAllCodes();
}
