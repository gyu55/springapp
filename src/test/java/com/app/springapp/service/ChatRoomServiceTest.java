package com.app.springapp.service;

import com.app.springapp.domain.dto.request.ChatMemberRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChatRoomServiceTest {
    @Autowired
    private ChatRoomService chatRoomService;

    @Test
    public void joinChatRoomTest() {
        Long chatRoomId = 3L;
        chatRoomService.joinChatRoom(chatRoomId);
    }
}
