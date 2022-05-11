package com.changbi.admin.controller;

import com.changbi.admin.domain.Notice;
import com.changbi.admin.service.NoticeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class NoticeController {

    private final NoticeService noticeService;


    @GetMapping("/notices")
    @ResponseBody
    public List<Notice> selectAll(){
        return noticeService.selectAll();
    }
}
