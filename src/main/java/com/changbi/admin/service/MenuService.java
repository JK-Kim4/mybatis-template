package com.changbi.admin.service;

import com.changbi.admin.domain.MenuCode;
import com.changbi.admin.mapper.mysql.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    @Transactional
    public List<MenuCode> selectAllCodes(){
        return menuRepository.selectAllCodes();
    }
}
