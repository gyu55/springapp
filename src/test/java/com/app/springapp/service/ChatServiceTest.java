package com.app.springapp.service;

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
}
