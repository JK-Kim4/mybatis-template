package com.changbi.admin.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * 도서정보 Entity
 * */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int bookId;
    private String bookTitle;
    private String bookContent;
    private int bookPages;
    private String bookSeries;
    private String bookIsbn;
    private String bookPublishDate;
    private String bookSize;
    private String bookPrice;
    private String bookIndex;
    private String bookAuthorSpeech;
    private String bookThumbnailPath;

}
