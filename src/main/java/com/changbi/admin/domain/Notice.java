package com.changbi.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 공지사항 Entity
 * */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    private int noticeId;
    private String noticeTitle;
    private String noticeContent;
    private String regDate;
    private String modDate;
    private int regUser;

}
