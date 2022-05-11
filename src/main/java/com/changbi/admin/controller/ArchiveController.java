package com.changbi.admin.controller;

import com.changbi.admin.domain.Archive;
import com.changbi.admin.service.ArchiveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class ArchiveController {

    private final ArchiveService archiveService;

    @GetMapping("/archives")
    @ResponseBody
    public List<Archive> selectAll(){
        return archiveService.selectAll();
    }
}
