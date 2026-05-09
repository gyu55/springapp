package com.app.springapp.service;

import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.repository.ChatDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChatServiceTest {
    @Autowired
    private ChatService chatService;

    // 채팅방 내 모든 메세지 불러오는 테스트
    @Test
    public void loadAllChatRoomMessageTest() {
        chatService.loadAllChatRoomMessage(2L)
                .stream()
                .forEach((chat) -> log.info(chat.toString()));
    }

//    채팅방 내에 메세지 작성
    @Test
    public void writeChatRoomMessageTest() {
        ChatRequestDTO chatRequestDTO = new ChatRequestDTO();
        chatRequestDTO.setChatRoomId(1L);
        chatRequestDTO.setChatContent("반가워요");
        chatRequestDTO.setChatType("텍스트");
        chatRequestDTO.setUserId(2L);

        chatService.writeChatMessage(chatRequestDTO);
    }

//    모든 채팅방 보여주는 서비스
    @Test
    public void loadAllChatRoomTest() {
        chatService.loadAllChatRoom()
                .stream()
                .forEach((chatRoom) -> log.info(chatRoom.toString()));
    }
}
