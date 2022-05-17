package com.changbi.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 * 기록창고 Entity
 * */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Archive {

    private int archiveId;
    private String archiveTitle;
    private String archiveContent;
    private String regDate;
    private String modDate;
    private int regUser;

}
