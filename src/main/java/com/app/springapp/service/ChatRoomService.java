package com.app.springapp.service;

import com.app.springapp.domain.dto.request.ChatMemberRequestDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;

public interface ChatRoomService {
//    순수하게 채팅방을 생성 하는것
    public void createChatRoom(ChatRequestDTO chatRequestDTO);

//    유저의 채팅방 참여 목록 추가
    public void joinChatRoom(Long chatRoomId);
}
