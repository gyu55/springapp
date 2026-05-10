package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.domain.dto.response.ChatResponseDTO;
import com.app.springapp.domain.dto.response.ChatRoomResponseDTO;
import com.app.springapp.domain.vo.ChatRoomVO;

import java.util.List;

public interface ChatService {
//    채팅방 내의 모든 메세지 불러오기
    public List<ChatResponseDTO> loadAllChatRoomMessage(Long chatRoomId);

//    채팅방 내 메세지 작성
    public ApiResponseDTO writeChatMessage(ChatRequestDTO chatRequestDTO);

//    유저가 채팅방 남긴 이력 확인
    public boolean isUserInChatRoom(ChatRequestDTO chatRequestDTO);

//    모든 채팅방들을 불러와주기
    public List<ChatRoomResponseDTO> loadAllChatRoom();
}
