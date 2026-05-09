package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;

import java.util.List;

public interface ChatService {
//    채팅방 내의 모든 메세지 불러오기
    public List<ChatDTO> loadAllChatRoomMessage(Long chatRoomId);

//    채팅방 내 메세지 작성
    public ApiResponseDTO writeChatMessage(ChatRequestDTO chatRequestDTO);
}
