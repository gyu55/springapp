package com.app.springapp.api;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Transactional(rollbackFor = {Exception.class})
@RequestMapping("/api/chat-rooms")
public class ChatRoomApi {

    // 모든 채팅방 불러오기
    @GetMapping("")
    public void getAllChatRooms() {


    }
}
