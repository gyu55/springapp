package com.app.springapp.repository;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.vo.ChatVO;
import com.app.springapp.mapper.ChatMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ChatDAO {
    private final ChatMapper chatMapper;

//    특정 채팅방 에서의 전체 메세지 불러오기
    public List<ChatDTO> findAll(Long chatRoomId) {
        return chatMapper.selectAll(chatRoomId);
    }

//    채팅방 내 메세지 작성
    public void save(ChatVO chatVO) {
        chatMapper.insert(chatVO);
    }
}
