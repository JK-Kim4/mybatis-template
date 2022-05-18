package com.changbi.admin.service;

import com.changbi.admin.domain.Archive;
import com.changbi.admin.mapper.mysql.ArchiveRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ArchiveService {

    private final ArchiveRepository archiveRepository;

    public List<Archive> selectAll(){
        return archiveRepository.selectAll();
    }
}
