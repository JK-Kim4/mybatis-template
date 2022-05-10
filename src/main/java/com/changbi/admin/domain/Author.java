package com.changbi.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * 저자정보 Entity
 * */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private int authorId;
    private String authorName;
    private String authorContent;
    private String authorThumbnailPath;

}
