package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;

import java.util.List;

public interface ChatService {
//    채팅방 내의 모든 메세지 불러오기
    public List<ChatDTO> loadAllChatRoomMessage(Long chatRoomId);
}
