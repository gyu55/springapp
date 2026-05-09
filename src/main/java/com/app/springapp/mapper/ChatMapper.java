package com.app.springapp.mapper;

import com.app.springapp.domain.dto.ChatDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {
//    특정 채팅방 에서의 전체 메세지 불러오기
    public List<ChatDTO> selectAll(Long id);
}
