package com.changbi.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * 메뉴코드 entity
 * */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuCode {

    private int menuCode;
    private String menuName;
    private int menuDepth;
    private int upperMenuCode;
    private char useYn;
    private String menuUrl;

}
