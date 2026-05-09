package com.app.springapp.repository;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.mapper.ChatMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@RequiredArgsConstructor
public class ChatDAO {
    private final ChatMapper chatMapper;

//    특정 채팅방 에서의 전체 메세지 불러오기
    public List<ChatDTO> findAll(Long chatRoomId) {
        return chatMapper.selectAll(chatRoomId);
    }
}
