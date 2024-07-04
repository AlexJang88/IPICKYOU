package com.project.pickyou.service;

import com.project.pickyou.dto.QaDTO;
import org.springframework.ui.Model;

public interface QaService {

    // qa 리스트 가져오기
    public void qaList(Model model);

    // qa insert
    public void qaInsert(QaDTO dto);

    // qa 상세정보 가져오기
    public void qaInformation(Model model, int ref);

    // qa 댓글 인서트
    public void qaReplyInsert(QaDTO dto, int ref);

    // qa 댓글 유무
    public void qaReplyCount(int ref, Model model);
}