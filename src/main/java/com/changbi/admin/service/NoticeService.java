package com.changbi.admin.service;

import com.changbi.admin.domain.Notice;
import com.changbi.admin.mapper.NoticeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;


    /**
     * 공지사항 전체 조회
     * Date : 2022.05.11
     * Author : kjw
     * */
    public List<Notice> selectAll(){
        return noticeRepository.selectAll();
    }

}
